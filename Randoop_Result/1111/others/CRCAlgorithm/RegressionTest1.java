package others.CRCAlgorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) (-1L));
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) 1);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 0, (double) ' ');
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 1, (double) 1L);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '4', (double) '#');
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '#', (double) (short) 10);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int13 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int13 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '#', (double) ' ');
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) 'a', (double) '4');
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) '#');
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', 10.0d);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 10, (double) (byte) 10);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) (-1.0f));
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        int int14 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) (short) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 1, (double) 'a');
        int int4 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        int int14 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int15 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 10, (double) (short) -1);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) 1L);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) '#');
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getCorrectMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, 0.0d);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        int int14 = cRCAlgorithm3.getCorrectMess();
        int int15 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) 0L);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass5 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        java.lang.Class<?> wildcardClass10 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int10 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) 10);
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) ' ', (double) 0);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 100, (double) ' ');
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int11 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) (short) 0);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int12 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        int int4 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 100, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) ' ');
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) 10.0f);
        int int4 = cRCAlgorithm3.getCorrectMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 10, 0.0d);
        int int4 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 1, (double) (-1.0f));
        int int4 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, (double) (byte) 1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) 0L);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '4', 100.0d);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 100, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (-1), 0.0d);
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, (double) (byte) 0);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '4', (double) 10.0f);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        int int16 = cRCAlgorithm3.getWrongMess();
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
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) 0L);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, 0.0d);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int12 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 100, (double) 'a');
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) 'a', (double) (byte) 0);
        cRCAlgorithm3.divideMessageWithP(true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int15 = cRCAlgorithm3.getWrongMessCaught();
        int int16 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int8 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) 10.0f);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 10, 1.0d);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, 10.0d);
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 100, (double) 'a');
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 10);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) -1, (double) (short) 0);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass5 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '4', 10.0d);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMess();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) 'a', 1.0d);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) (-1L));
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) '#');
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
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
        java.lang.Class<?> wildcardClass14 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
        int int14 = cRCAlgorithm3.getWrongMess();
        int int15 = cRCAlgorithm3.getCorrectMess();
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
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int9 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (-1), (double) 100);
        int int4 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
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
        java.lang.Class<?> wildcardClass13 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 10);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (-1), (double) (byte) -1);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
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
        cRCAlgorithm3.divideMessageWithP(false);
        int int16 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass11 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 100, (double) (short) -1);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 100, (double) (byte) -1);
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int11 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        java.lang.Class<?> wildcardClass14 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 1);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, (double) (byte) 1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) ' ', (double) 100L);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 100, (double) 1.0f);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        int int12 = cRCAlgorithm3.getWrongMessCaught();
        int int13 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '#', (double) ' ');
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 1, (double) '#');
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int12 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int14 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.divideMessageWithP(true);
        int int14 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) ' ', (double) (byte) 10);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 10, (double) 1);
        int int4 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '4', 0.0d);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getCorrectMess();
        java.lang.Class<?> wildcardClass7 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 10, (double) 10.0f);
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        int int6 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) ' ', (-1.0d));
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) '#');
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) ' ');
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) '#');
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 10, (double) (byte) -1);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 10, (double) ' ');
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int8 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass9 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 0, (double) (byte) 100);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '4', (double) (byte) 1);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
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
        int int15 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        java.lang.Class<?> wildcardClass12 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '4', 0.0d);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int14 = cRCAlgorithm3.getWrongMess();
        int int15 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', 10.0d);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        int int7 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '#', 1.0d);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) (short) 0);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) -1, (double) 10.0f);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) 100L);
        cRCAlgorithm3.divideMessageWithP(true);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
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
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) 1L);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getCorrectMess();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        int int13 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        int int15 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        int int6 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 0, (double) (-1));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) (-1L));
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) ' ', (double) 10L);
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
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
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 100, (double) 10L);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        int int14 = cRCAlgorithm3.getWrongMessNotCaught();
        int int15 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int14 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass15 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int11 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 1, (double) 0.0f);
        int int4 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        int int12 = cRCAlgorithm3.getWrongMess();
        int int13 = cRCAlgorithm3.getWrongMessCaught();
        int int14 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
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
        cRCAlgorithm3.refactor();
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
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) 0L);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMess();
        java.lang.Class<?> wildcardClass6 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 10, (double) ' ');
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(false);
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) 'a', (double) 10);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, 1.0d);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) ' ', (double) (byte) 100);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) 10);
        int int4 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 100, 0.0d);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getCorrectMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (-1), (double) 100L);
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.changeMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        int int11 = cRCAlgorithm3.getWrongMess();
        int int12 = cRCAlgorithm3.getWrongMessNotCaught();
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 0, (double) (byte) 1);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        java.lang.Class<?> wildcardClass5 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, 0.0d);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 1, (double) '4');
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) ' ');
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (short) 0, (double) '#');
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) '#');
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.generateRandomMess();
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) ' ', 0.0d);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 1, (double) '4');
        int int4 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        java.lang.Class<?> wildcardClass8 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 0, (double) (byte) 100);
        java.lang.Class<?> wildcardClass4 = cRCAlgorithm3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 1, (double) '4');
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
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
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 0, (double) (byte) 100);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '4', (-1.0d));
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
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
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getCorrectMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getCorrectMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.divideMessageWithP(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        int int12 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.changeMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 0, (double) 1L);
        int int4 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) '#');
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        int int8 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.changeMess();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        int int9 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) (-1.0f));
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int7 = cRCAlgorithm3.getWrongMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
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
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) '4', (double) 1);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.generateRandomMess();
        int int5 = cRCAlgorithm3.getWrongMess();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        int int7 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) (byte) 10, (double) ' ');
        cRCAlgorithm3.refactor();
        cRCAlgorithm3.refactor();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMess();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int7 = cRCAlgorithm3.getWrongMess();
        int int8 = cRCAlgorithm3.getWrongMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 10, (double) (short) -1);
        cRCAlgorithm3.refactor();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(true);
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        int int11 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        int int13 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", 0, (double) '#');
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) 10, (double) 100L);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", 1, (double) (short) 100);
        int int4 = cRCAlgorithm3.getWrongMessCaught();
        int int5 = cRCAlgorithm3.getWrongMessCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        int int6 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        int int8 = cRCAlgorithm3.getWrongMessCaught();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        int int6 = cRCAlgorithm3.getWrongMess();
        cRCAlgorithm3.refactor();
        int int8 = cRCAlgorithm3.getCorrectMess();
        int int9 = cRCAlgorithm3.getWrongMessCaught();
        int int10 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
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
        int int15 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
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
        int int13 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.divideMessageWithP(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        int int4 = cRCAlgorithm3.getWrongMessNotCaught();
        int int5 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.divideMessageWithP(false);
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        int int10 = cRCAlgorithm3.getCorrectMess();
        int int11 = cRCAlgorithm3.getWrongMessNotCaught();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) 10, (double) '#');
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.changeMess();
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        cRCAlgorithm3.changeMess();
        int int9 = cRCAlgorithm3.getWrongMess();
        int int10 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("", (int) '4', (double) '#');
        cRCAlgorithm3.divideMessageWithP(false);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.changeMess();
        cRCAlgorithm3.divideMessageWithP(true);
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        cRCAlgorithm3.refactor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (byte) -1, (double) (short) 0);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.refactor();
        int int7 = cRCAlgorithm3.getWrongMessCaught();
        int int8 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int10 = cRCAlgorithm3.getWrongMessCaught();
        int int11 = cRCAlgorithm3.getCorrectMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.thealgorithms.others.CRCAlgorithm cRCAlgorithm3 = new com.thealgorithms.others.CRCAlgorithm("hi!", (int) (short) -1, (double) (byte) -1);
        cRCAlgorithm3.divideMessageWithP(false);
        cRCAlgorithm3.changeMess();
        int int7 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        int int9 = cRCAlgorithm3.getWrongMessNotCaught();
        cRCAlgorithm3.generateRandomMess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }
}

