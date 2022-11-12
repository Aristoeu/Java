package RabinKarpAlgorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
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
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
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
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
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
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
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
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
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
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
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
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (-1));
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
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
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
        int int52 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
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
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int64 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int72 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
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
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
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
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", 10);
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
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
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
        int int56 = rabinKarpAlgorithm0.search("", "", 0);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int64 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
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
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) 'a');
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
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int56 = rabinKarpAlgorithm0.search("", "", 100);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int64 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int72 = rabinKarpAlgorithm0.search("", "hi!", 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int64 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int68 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int72 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (-1));
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
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
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
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
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
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
        int int56 = rabinKarpAlgorithm0.search("", "", 100);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int68 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
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
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
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
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
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
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
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
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
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
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int64 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
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
        int int44 = rabinKarpAlgorithm0.search("", "", 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (-1));
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
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
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
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int64 = rabinKarpAlgorithm0.search("", "hi!", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 10);
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
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
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
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
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
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
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
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int60 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
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
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
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
        int int60 = rabinKarpAlgorithm0.search("", "", 1);
        int int64 = rabinKarpAlgorithm0.search("", "", (int) 'a');
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
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
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
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
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
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
        int int56 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int60 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) 'a');
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
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
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
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
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
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
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
        int int56 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int56 = rabinKarpAlgorithm0.search("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
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
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
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
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
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
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
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
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
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
        int int48 = rabinKarpAlgorithm0.search("", "", 1);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '#');
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
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 1);
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
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
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
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
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
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
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
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
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
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
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
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
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
        int int52 = rabinKarpAlgorithm0.search("", "", 256);
        int int56 = rabinKarpAlgorithm0.search("", "", 10);
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
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
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
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
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) 'a');
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
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
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
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "", (-1));
        int int12 = rabinKarpAlgorithm0.search("", "", 0);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
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
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "", 256);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", 10);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "", (-1));
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", 1);
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
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
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
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "", (-1));
        int int12 = rabinKarpAlgorithm0.search("", "", 0);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
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
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
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
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
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
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
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
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
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
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
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
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
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
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
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
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
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
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
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
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
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
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
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
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (-1));
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
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
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
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
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
        // The following exception was thrown during execution in test generation
        try {
            int int60 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
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
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
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
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
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
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
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
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
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
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
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
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
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
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int48 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
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
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
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
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
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
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
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
        int int80 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
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
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
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
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "", 10);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 1);
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
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 1);
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
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
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
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
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
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
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
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
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
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", 100);
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
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
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
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
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
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
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
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) 'a');
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
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
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
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int72 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int76 = rabinKarpAlgorithm0.search("hi!", "", (int) 'a');
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
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
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
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("", "", 10);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = rabinKarpAlgorithm0.search("hi!", "", (int) '#');
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
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
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
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 10);
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
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
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
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
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
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
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
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
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
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
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
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", 10);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
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
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
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
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
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
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
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
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
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
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
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
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
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
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
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
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
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
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 1);
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
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int12 = rabinKarpAlgorithm0.search("", "", 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        java.lang.Class<?> wildcardClass17 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
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
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
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
        int int76 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass77 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
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
        int int44 = rabinKarpAlgorithm0.search("", "", 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
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
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
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
        int int44 = rabinKarpAlgorithm0.search("", "", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int28 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", 10);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
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
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
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
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
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
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
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
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
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
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
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
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 1);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) 'a');
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
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int64 = rabinKarpAlgorithm0.search("hi!", "", 10);
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
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
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
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
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
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
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
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
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
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = rabinKarpAlgorithm0.search("hi!", "", 100);
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
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
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
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
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
        int int64 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
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
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
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
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
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
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
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
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 10);
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
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
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
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
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
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
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
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
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
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
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
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", 10);
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
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
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
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 256);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
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
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "", 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
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
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int64 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
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
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "", (-1));
        int int12 = rabinKarpAlgorithm0.search("", "", 0);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
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
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) '4');
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
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) '4');
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
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (-1));
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
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
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
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
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
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
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
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
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
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
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
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
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
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
        int int60 = rabinKarpAlgorithm0.search("", "", 1);
        int int64 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
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
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
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
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
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
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
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
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
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
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
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
        int int76 = rabinKarpAlgorithm0.search("", "", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int12 = rabinKarpAlgorithm0.search("", "", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
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
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
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
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
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
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
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
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
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
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
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
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int68 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (-1));
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
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
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
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
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
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
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 256);
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
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
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
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
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
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
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
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
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
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
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
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int48 = rabinKarpAlgorithm0.search("", "", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
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
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("", "", (-1));
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
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
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", 256);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
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
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (-1));
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
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
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
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
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
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
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
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
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "", 10);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int56 = rabinKarpAlgorithm0.search("", "", 256);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
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
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 1);
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
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int56 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int12 = rabinKarpAlgorithm0.search("", "", 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
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
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
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
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
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
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
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
        int int56 = rabinKarpAlgorithm0.search("", "", 0);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int64 = rabinKarpAlgorithm0.search("", "", 1);
        int int68 = rabinKarpAlgorithm0.search("", "", 1);
        int int72 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
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
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = rabinKarpAlgorithm0.search("hi!", "", 10);
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
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", 100);
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
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
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
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
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
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (-1));
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
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
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
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
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
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
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 1);
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
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
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
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
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
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
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
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int52 = rabinKarpAlgorithm0.search("", "", (-1));
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
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", 10);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
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
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
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
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
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
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int48 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int60 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int64 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int72 = rabinKarpAlgorithm0.search("", "", 10);
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
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
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
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
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
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
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
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
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
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
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
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int72 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
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
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
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
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
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
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
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
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int52 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
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
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int64 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int68 = rabinKarpAlgorithm0.search("", "", 10);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 0);
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
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
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
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (-1));
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
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
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
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
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
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
        int int48 = rabinKarpAlgorithm0.search("", "", 100);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", 256);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 100);
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
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
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
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 1);
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
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
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
        int int40 = rabinKarpAlgorithm0.search("", "", 10);
        int int44 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
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
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
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
        int int48 = rabinKarpAlgorithm0.search("", "", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int52 = rabinKarpAlgorithm0.search("", "", (-1));
        int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = rabinKarpAlgorithm0.search("hi!", "", (int) '4');
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
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
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
        int int64 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int68 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
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
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
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
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
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
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", 10);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
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
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
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
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
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
        int int44 = rabinKarpAlgorithm0.search("", "", 1);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int52 = rabinKarpAlgorithm0.search("", "", 0);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) 'a');
        int int60 = rabinKarpAlgorithm0.search("", "hi!", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("", "", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
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
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
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
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) -1);
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
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
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
        // The following exception was thrown during execution in test generation
        try {
            int int64 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 0);
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
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = rabinKarpAlgorithm0.search("hi!", "", (int) (byte) 100);
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
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
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
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
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
            int int44 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
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
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
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
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 256);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
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
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("", "", 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
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
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
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
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
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
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
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
        // The following exception was thrown during execution in test generation
        try {
            int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 0);
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
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
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
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", (-1));
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
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
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
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
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
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
        int int60 = rabinKarpAlgorithm0.search("", "hi!", (int) '4');
        int int64 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int68 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 10);
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
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) 0);
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
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int52 = rabinKarpAlgorithm0.search("", "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int56 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 0);
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
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = rabinKarpAlgorithm0.search("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", 1);
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
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
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
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
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
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
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
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
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
        int int44 = rabinKarpAlgorithm0.search("", "", 0);
        int int48 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
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
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
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
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 0);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int40 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("", "", 100);
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
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", 256);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 100);
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
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
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
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
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 1);
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", (-1));
        int int24 = rabinKarpAlgorithm0.search("", "", 100);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "", 0);
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
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
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
        // The following exception was thrown during execution in test generation
        try {
            int int40 = rabinKarpAlgorithm0.search("hi!", "", (int) '4');
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
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
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
        int int48 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) ' ');
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
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int56 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
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
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
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
        int int40 = rabinKarpAlgorithm0.search("", "hi!", 0);
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
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int44 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
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
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
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
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 10);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int20 = rabinKarpAlgorithm0.search("", "", 100);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", 10);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int32 = rabinKarpAlgorithm0.search("", "", 256);
        int int36 = rabinKarpAlgorithm0.search("", "", 10);
        int int40 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
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
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
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
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int12 = rabinKarpAlgorithm0.search("", "", (int) '4');
        java.lang.Class<?> wildcardClass13 = rabinKarpAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
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
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
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
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "", 0);
        int int32 = rabinKarpAlgorithm0.search("", "", 100);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
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
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
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
        // The following exception was thrown during execution in test generation
        try {
            int int48 = rabinKarpAlgorithm0.search("hi!", "", (int) (short) -1);
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
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) '#');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 100);
        int int28 = rabinKarpAlgorithm0.search("", "", (int) '4');
        int int32 = rabinKarpAlgorithm0.search("", "", (int) 'a');
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
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
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
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (-1));
        int int56 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int60 = rabinKarpAlgorithm0.search("hi!", "", 0);
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
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", 256);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 256);
        int int20 = rabinKarpAlgorithm0.search("", "", 1);
        int int24 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '#');
        int int28 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) -1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
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
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) -1);
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
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
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) 'a');
        int int24 = rabinKarpAlgorithm0.search("", "", 10);
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
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) 'a');
        int int32 = rabinKarpAlgorithm0.search("hi!", "hi!", 100);
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
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
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
        int int64 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = rabinKarpAlgorithm0.search("hi!", "", (int) ' ');
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
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
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
        int int52 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int56 = rabinKarpAlgorithm0.search("", "", 100);
        int int60 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
        int int64 = rabinKarpAlgorithm0.search("", "", 0);
        int int68 = rabinKarpAlgorithm0.search("", "", (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 100);
        int int16 = rabinKarpAlgorithm0.search("", "", (int) (short) 1);
        int int20 = rabinKarpAlgorithm0.search("", "hi!", (int) '#');
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 100);
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
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
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
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("", "", 10);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 100);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) (byte) 0);
        int int36 = rabinKarpAlgorithm0.search("", "hi!", 1);
        int int40 = rabinKarpAlgorithm0.search("", "", (int) (short) 0);
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
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) ' ');
        int int8 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 100);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int16 = rabinKarpAlgorithm0.search("", "", 0);
        int int20 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", (int) (short) 1);
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
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
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
        int int52 = rabinKarpAlgorithm0.search("", "hi!", 10);
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
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "", (int) (byte) 1);
        int int12 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) '4');
        int int20 = rabinKarpAlgorithm0.search("", "hi!", 10);
        int int24 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 0);
        int int32 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) 1);
        int int36 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int40 = rabinKarpAlgorithm0.search("hi!", "hi!", (-1));
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
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
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
        int int44 = rabinKarpAlgorithm0.search("", "hi!", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
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
        int int44 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (byte) 1);
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
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        com.thealgorithms.searches.RabinKarpAlgorithm rabinKarpAlgorithm0 = new com.thealgorithms.searches.RabinKarpAlgorithm();
        int int4 = rabinKarpAlgorithm0.search("", "hi!", 0);
        int int8 = rabinKarpAlgorithm0.search("", "hi!", (int) ' ');
        int int12 = rabinKarpAlgorithm0.search("", "", (int) (byte) 10);
        int int16 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) -1);
        int int20 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 1);
        int int24 = rabinKarpAlgorithm0.search("", "", (int) (short) 10);
        int int28 = rabinKarpAlgorithm0.search("", "hi!", (int) (byte) -1);
        int int32 = rabinKarpAlgorithm0.search("", "", (int) ' ');
        int int36 = rabinKarpAlgorithm0.search("hi!", "hi!", (int) (short) 10);
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
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
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
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
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
        int int48 = rabinKarpAlgorithm0.search("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int52 = rabinKarpAlgorithm0.search("hi!", "", (-1));
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
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
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
}
