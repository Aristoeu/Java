package others.CRCAlgorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass5 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass5 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 1, (double) 100.0f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 100, (double) 1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        int int8 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '4', (double) 10);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) 1.0f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 100, (double) (byte) 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 1, (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 100, (double) 'a');
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', 10.0d);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 10, 0.0d);
        cRCAlgorithm3.divideMessageWithP(true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        java.lang.Class<?> wildcardClass16 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getCorrectMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, 1.0d);
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int12 = cRCAlgorithm3.getCorrectMess();
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 1, (double) (short) 100);
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int12 = cRCAlgorithm3.getCorrectMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (-1), 0.0d);
        int int4 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        int int14 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int9 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int12 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        int int12 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (-1.0d));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) (short) -1);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        int int12 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (-1), 0.0d);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, 1.0d);
        cRCAlgorithm3.divideMessageWithP(false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) 'a', 1.0d);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass13 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) ' ');
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 10, (double) (byte) 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 10);
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 10);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 1, (double) (short) 100);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        int int14 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass15 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) 1L);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass13 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) '#');
        int int4 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (-1), 0.0d);
        int int4 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass5 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (-1), (double) ' ');
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) '#');
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 1, 100.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) 10.0f);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, 1.0d);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int9 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '#', (double) 0L);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMess();
        int int5 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) 10.0f);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 10);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) 1L);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 10);
        int int4 = cRCAlgorithm3.getWrongMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, 10.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int12 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 100, (double) 1);
        cRCAlgorithm3.divideMessageWithP(false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, 1.0d);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) 1L);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 10, (double) (byte) 100);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 1, (double) '4');
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) ' ', (-1.0d));
        int int4 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) '#');
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, 1.0d);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass13 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '#', 1.0d);
        int int4 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 10);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) ' ', (double) 100);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        int int14 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getCorrectMess();
        int int12 = cRCAlgorithm3.getCorrectMess();
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) ' ', (double) (short) 1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass14 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        int int13 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 100, (double) 100L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) ' ', (double) 10L);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 10, 0.0d);
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) ' ', (double) (short) -1);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getCorrectMess();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 10);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) 10.0f);
        cRCAlgorithm3.divideMessageWithP(true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        int int13 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 1, (double) 'a');
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 10, (double) 1L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        int int11 = cRCAlgorithm3.getCorrectMess();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 10);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) '#');
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 10, (double) ' ');
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) (-1.0f));
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) (short) -1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) (short) 0);
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 10, (double) 0.0f);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) 10.0f);
        int int4 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '4', (double) 0L);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        int int13 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) ' ', (double) (-1.0f));
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        int int13 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 100, (double) 10L);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', 10.0d);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 1, (double) 'a');
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 100, (double) 10L);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int12 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 0, (double) (byte) 100);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getCorrectMess();
        int int13 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.divideMessageWithP(true);
        int int18 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '#', (double) (short) -1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '#', (double) 0L);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int12 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 1);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) 10.0f);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int6 = cRCAlgorithm3.getCorrectMess();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int9 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) (byte) 10);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) (-1.0f));
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) ' ', (double) (-1.0f));
        cRCAlgorithm3.divideMessageWithP(true);
        int int6 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        int int14 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, 10.0d);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass13 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        int int13 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', 10.0d);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) (-1.0f));
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass5 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '4', (-1.0d));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        int int13 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass14 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) 10.0f);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int7 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (byte) 100);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        int int12 = cRCAlgorithm3.getCorrectMess();
        int int13 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 100, (double) 0L);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) 'a', (double) '4');
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        int int11 = cRCAlgorithm3.getWrongMess();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int12 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int14 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 10, (double) 10.0f);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass14 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int13 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, (double) '#');
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (-1), (double) 10);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) 10.0f);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 0, 100.0d);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) 100.0f);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 10, (double) 100L);
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 100, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) 10);
        cRCAlgorithm3.divideMessageWithP(false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '#', (double) 100);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        int int12 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 100, (double) 100);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '4', (double) 10.0f);
        int int4 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) 1L);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getCorrectMess();
        int int13 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int16 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int14 = cRCAlgorithm3.getCorrectMess();
        int int15 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '4', (double) 10);
        cRCAlgorithm3.divideMessageWithP(true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '#', 1.0d);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getCorrectMess();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        int int11 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (short) 10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) ' ');
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int14 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '#', 1.0d);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getCorrectMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) 0L);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 100, 0.0d);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.refactor();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, (double) (short) 1);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 1, (double) (byte) 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        int int14 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        int int13 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 0, (-1.0d));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) 'a', (double) 0.0f);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 1, (double) 'a');
        cRCAlgorithm3.divideMessageWithP(false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int12 = cRCAlgorithm3.getCorrectMess();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, (double) 10.0f);
        int int4 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        int int7 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) (byte) 100);
        int int4 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass5 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) 1L);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass5 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) (-1L));
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 10, (double) ' ');
        cRCAlgorithm3.divideMessageWithP(true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '#', 1.0d);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '#', 1.0d);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass14 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int13 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (byte) 1);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 100, (double) (short) -1);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) 'a');
        int int4 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) '#');
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int9 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int12 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        int int8 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) (-1.0f));
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 0, (double) (byte) 100);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) ' ', (double) 100);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        int int12 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 100, (double) 10L);
        int int4 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) '#');
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) (short) 0);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int14 = cRCAlgorithm3.getWrongMess();
        int int15 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        int int14 = cRCAlgorithm3.getWrongMessNotCaught();
        int int15 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass16 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        int int14 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int16 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getCorrectMess();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        int int14 = cRCAlgorithm3.getWrongMessCaught();
        int int15 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) '#');
        cRCAlgorithm3.divideMessageWithP(false);
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, (double) 10L);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 100, (double) (byte) 1);
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        int int14 = cRCAlgorithm3.getWrongMessCaught();
        int int15 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (-1), (double) (short) 1);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, (double) (byte) 1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) 1L);
        int int4 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass5 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 0, (double) (-1));
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int11 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (-1), (double) 0L);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int16 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        int int13 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        int int13 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int12 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass13 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) ' ', (double) (byte) 10);
        cRCAlgorithm3.divideMessageWithP(false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 100, (double) 1);
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) 10.0f);
        int int4 = cRCAlgorithm3.getCorrectMess();
        int int5 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) 1L);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }
}

