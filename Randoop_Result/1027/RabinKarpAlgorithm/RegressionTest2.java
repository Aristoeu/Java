package RabinKarpAlgorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = rabinKarpAlgorithm0.search("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 0);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("", "", 10);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 100);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", 256);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '4');
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "", 1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass61 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        int int52 = rabinKarpAlgorithm0.search("", "", 100);
        java.lang.Class<?> wildcardClass53 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("", "", 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 256);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 1);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 100);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass53 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        int int52 = rabinKarpAlgorithm0.search("", "", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
        int int44 = rabinKarpAlgorithm0.search("", "", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", (-1));
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '4');
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("", "", 10);
        int int52 = rabinKarpAlgorithm0.search("", "", 100);
        java.lang.Class<?> wildcardClass53 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("", "", 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int64 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int68 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass69 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int64 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass65 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
        int int44 = rabinKarpAlgorithm0.search("", "", 1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '4');
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int64 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        java.lang.Class<?> wildcardClass65 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass53 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int60 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '4');
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass69 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
        int int44 = rabinKarpAlgorithm0.search("", "", 256);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int36 = rabinKarpAlgorithm0.search("", "", 100);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int44 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
        int int44 = rabinKarpAlgorithm0.search("", "", 256);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass57 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int36 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 0);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("", "", 100);
        java.lang.Class<?> wildcardClass53 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int56 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass57 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("", "", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '#');
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
        int int44 = rabinKarpAlgorithm0.search("", "", 256);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", (-1));
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 100);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", (-1));
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 256);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 100);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int68 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass69 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        java.lang.Class<?> wildcardClass25 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        java.lang.Class<?> wildcardClass33 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int64 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int68 = rabinKarpAlgorithm0.search("", "", 10);
        java.lang.Class<?> wildcardClass69 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 100);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        java.lang.Class<?> wildcardClass49 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass41 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int16 = rabinKarpAlgorithm0.search("", "", 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", 10);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("", "", 10);
        java.lang.Class<?> wildcardClass45 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }
}
