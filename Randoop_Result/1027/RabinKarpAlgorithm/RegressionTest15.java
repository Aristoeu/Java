package RabinKarpAlgorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("", "", 1);
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
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
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
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
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int60 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
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
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", 100);
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
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", 10);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
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
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "", 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int48 = rabinKarpAlgorithm0.search("", "", 100);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
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
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
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
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
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
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", 256);
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
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
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
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
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
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) '4');
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
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int48 = rabinKarpAlgorithm0.search("", "", 10);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
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
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
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
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
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
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
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
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
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
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
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
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
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
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
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
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "", 256);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
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
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
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
        int int60 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int64 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
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
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int72 = rabinKarpAlgorithm0.search("", "", (-1));
        int int76 = rabinKarpAlgorithm0.search("", "", 0);
        int int80 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int84 = rabinKarpAlgorithm0.search("hi!", "", 10);
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '4');
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
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
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
        int int72 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
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
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
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
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
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
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", (-1));
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
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
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", 256);
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
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
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
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
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
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 0);
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
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
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
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int48 = rabinKarpAlgorithm0.search("", "", 100);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
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
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
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
        int int56 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
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
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
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
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
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
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int52 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (-1));
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
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("", "", 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int44 = rabinKarpAlgorithm0.search("", "", 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int52 = rabinKarpAlgorithm0.search("", "", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", 10);
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
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", 1);
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
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
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
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
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
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int12 = rabinKarpAlgorithm0.search("", "", 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
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
        int int60 = rabinKarpAlgorithm0.search("", "", 0);
        int int64 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
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
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
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
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", 256);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
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
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
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
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "", 10);
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
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
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
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
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
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
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
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "", (-1));
        int int48 = rabinKarpAlgorithm0.search("", "", 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int60 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
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
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
        int int44 = rabinKarpAlgorithm0.search("", "", 1);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int52 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
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
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
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
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
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
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
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
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
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
        int int44 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
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
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
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
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int40 = rabinKarpAlgorithm0.search("", "", 10);
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
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
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
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int52 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (-1));
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
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int48 = rabinKarpAlgorithm0.search("", "", 100);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (-1));
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
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (-1));
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
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
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
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
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
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
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
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
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
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
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int52 = rabinKarpAlgorithm0.search("", "", 100);
        int int56 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
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
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
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
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
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
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
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
        int int56 = rabinKarpAlgorithm0.search("", "", 100);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", 1);
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
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) 'a');
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
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
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
        int int56 = rabinKarpAlgorithm0.search("", "", 100);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
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
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
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
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int68 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
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
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
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
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
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
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int52 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
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
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int52 = rabinKarpAlgorithm0.search("", "", 1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
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
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
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
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
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
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 10);
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
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
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
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int64 = rabinKarpAlgorithm0.search("", "", 10);
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
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int52 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
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
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
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
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
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
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", 100);
        int int52 = rabinKarpAlgorithm0.search("", "", 10);
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
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '4');
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
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int52 = rabinKarpAlgorithm0.search("", "", (-1));
        int int56 = rabinKarpAlgorithm0.search("", "", 1);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
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
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
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
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) -1);
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
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", 1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
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
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
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
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
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
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
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
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 1);
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
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
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
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int64 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", 256);
        int int52 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
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
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", 100);
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
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
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
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int44 = rabinKarpAlgorithm0.search("", "", 1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", 1);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
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
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 0);
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
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "", 100);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", 0);
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
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", 256);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int56 = rabinKarpAlgorithm0.search("", "", 10);
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
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
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
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
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
        int int72 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int76 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int80 = rabinKarpAlgorithm0.search("", "hi!", 1);
        java.lang.Class<?> wildcardClass81 = rabinKarpAlgorithm0.getClass();
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
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
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int64 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
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
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
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
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int56 = rabinKarpAlgorithm0.search("", "", (int) '4');
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
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
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
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
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
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 100);
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
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
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
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("", "", 100);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
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
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
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
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
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
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int68 = rabinKarpAlgorithm0.search("", "", 100);
        int int72 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int76 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int80 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
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
        // The following exception was thrown during execution in test generation
        try {
            int int72 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", (-1));
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
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
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
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
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", 0);
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
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", 0);
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
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
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
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 1);
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
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
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
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
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
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 0);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int44 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("", "", 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) '4');
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
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) '4');
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
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
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
        int int72 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int76 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int80 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
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
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", 0);
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
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
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
            int int36 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
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
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (-1));
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", 10);
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
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) '4');
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
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int56 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
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
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
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
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
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
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
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
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", 1);
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", 10);
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
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
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
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
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
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int64 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 1);
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
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("", "", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 0);
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
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
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
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
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
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
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
        int int60 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int64 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int68 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int72 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass73 = rabinKarpAlgorithm0.getClass();
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
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
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int52 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int52 = rabinKarpAlgorithm0.search("", "", (-1));
        int int56 = rabinKarpAlgorithm0.search("", "", 1);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = rabinKarpAlgorithm0.search("hi!", "", (-1));
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
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int56 = rabinKarpAlgorithm0.search("", "", 10);
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
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
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
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
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
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
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
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) 'a');
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
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int60 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int64 = rabinKarpAlgorithm0.search("", "", 10);
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
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
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
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
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
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
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
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
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
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
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
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
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
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
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
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
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
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
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
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int48 = rabinKarpAlgorithm0.search("", "", 100);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
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
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
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
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int64 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int68 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
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
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) -1);
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
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", (-1));
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int64 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
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
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
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
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
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
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (-1));
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int60 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int68 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int72 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        java.lang.Class<?> wildcardClass73 = rabinKarpAlgorithm0.getClass();
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
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
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
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
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int48 = rabinKarpAlgorithm0.search("", "", 256);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int56 = rabinKarpAlgorithm0.search("", "", 10);
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
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
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
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
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
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
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
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
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
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "", 100);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
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
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int56 = rabinKarpAlgorithm0.search("", "", 256);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int64 = rabinKarpAlgorithm0.search("", "", (-1));
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
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
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int60 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", 0);
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
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
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
        int int56 = rabinKarpAlgorithm0.search("", "", 100);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
}

