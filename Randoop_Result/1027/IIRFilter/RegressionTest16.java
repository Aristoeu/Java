package IIRFilter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray16 = new double[] { 1.0f, (short) 10 };
        double[] doubleArray18 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0]");
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process(1.0d);
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 100L);
        double double17 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 0);
        double[] doubleArray18 = new double[] { 10, 100, (short) 0, 10.0f, 52.0d, (byte) 10 };
        double[] doubleArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0, 0.0, 10.0, 52.0, 10.0]");
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) 1L);
        double double11 = iIRFilter1.process((double) '#');
        double[] doubleArray15 = new double[] { (-1), '4', (byte) 0 };
        double[] doubleArray20 = new double[] { (byte) 0, 35.0d, 10L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 35.0, 10.0, 100.0]");
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process(100.0d);
        double double19 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 10);
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) 10.0f);
        double double21 = iIRFilter1.process((double) 1L);
        double double23 = iIRFilter1.process((double) 0L);
        double double25 = iIRFilter1.process((double) 10.0f);
        double double27 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray25 = new double[] { (byte) 0, 1.0d, 97.0d, 100, '#', 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0, 97.0, 100.0, 35.0, 100.0]");
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) 100);
        double double21 = iIRFilter1.process(97.0d);
        double[] doubleArray25 = new double[] { ' ', 32.0d, 0.0f };
        double[] doubleArray30 = new double[] { 0.0f, (short) 1, 10.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0, 10.0, 0.0]");
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 1);
        double double9 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray15 = new double[] { (byte) 0, (byte) 100, 100, 97.0d, (-1.0f) };
        double[] doubleArray17 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 100.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process(10.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process(32.0d);
        double double19 = iIRFilter1.process((double) 0.0f);
        double double21 = iIRFilter1.process(52.0d);
        double double23 = iIRFilter1.process((double) '4');
        double[] doubleArray25 = new double[] { (-1L) };
        double[] doubleArray26 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 100L);
        double double19 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 0);
        double double17 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process(100.0d);
        double double19 = iIRFilter1.process((double) '4');
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (short) 0);
        double double19 = iIRFilter1.process((double) (short) 10);
        double double21 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 10);
        double[] doubleArray20 = new double[] { (byte) 10, (-1L), 1.0d, 1.0d };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process(97.0d);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) (-1.0f));
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray21 = new double[] { (byte) 100, 'a', 0L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 97.0, 0.0, 100.0]");
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) 1L);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0]");
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray17 = new double[] { 52.0d };
        double[] doubleArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0]");
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 100);
        double[] doubleArray8 = new double[] { 0, 100, '4', (short) -1 };
        double[] doubleArray10 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 1);
        double double19 = iIRFilter1.process(52.0d);
        double double21 = iIRFilter1.process((double) 10.0f);
        double double23 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process(52.0d);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray18 = new double[] { 0L, 0.0f, 0, 100, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 100.0, 100.0]");
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process(97.0d);
        double[] doubleArray20 = new double[] { (short) 10, ' ', 100.0d, 100.0f };
        double[] doubleArray26 = new double[] { 100.0f, 1.0f, 0, 97.0d, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 32.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0, 0.0, 97.0, -1.0]");
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process(10.0d);
        double double21 = iIRFilter1.process(1.0d);
        double double23 = iIRFilter1.process((double) (short) 1);
        double double25 = iIRFilter1.process((double) (-1));
        double double27 = iIRFilter1.process((double) 1L);
        double double29 = iIRFilter1.process((double) 'a');
        double double31 = iIRFilter1.process((-1.0d));
        double[] doubleArray32 = new double[] {};
        double[] doubleArray39 = new double[] { 32.0d, (byte) 100, 100.0f, 52.0d, 1.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray32, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[32.0, 100.0, 100.0, 52.0, 1.0, 1.0]");
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process(52.0d);
        double[] doubleArray12 = new double[] { 100, 10.0d, (short) 1, 10L };
        double[] doubleArray14 = new double[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0]");
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 100L);
        double[] doubleArray10 = new double[] { '4', 0.0f, 97.0d, 10L };
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 0.0, 97.0, 10.0]");
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) 10L);
        double double21 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray27 = new double[] { (-1L), (byte) 100, (byte) 10, (short) 1, (byte) 100 };
        double[] doubleArray29 = new double[] { 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 100.0, 10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0]");
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process((double) '4');
        double double23 = iIRFilter1.process((double) (short) 10);
        double double25 = iIRFilter1.process(100.0d);
        double double27 = iIRFilter1.process((double) '4');
        double double29 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray36 = new double[] { (byte) -1, 0, 52.0d, 10.0f, 52.0d, (byte) 10 };
        double[] doubleArray41 = new double[] { (-1.0f), 10.0f, 1L, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray36, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 52.0, 10.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 10.0, 1.0, 10.0]");
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 1);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) ' ');
        double double21 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (short) 0);
        double double19 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray25 = new double[] { 1.0d, 'a', 100L, 10.0f, 'a' };
        double[] doubleArray28 = new double[] { (-1.0f), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 97.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 10.0]");
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double double21 = iIRFilter1.process((double) (short) -1);
        double double23 = iIRFilter1.process(0.0d);
        double double25 = iIRFilter1.process((double) 0);
        double double27 = iIRFilter1.process((double) 100.0f);
        double double29 = iIRFilter1.process((double) (short) 10);
        double double31 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray18 = new double[] { (byte) 10, 1.0d };
        double[] doubleArray25 = new double[] { 10, 10L, 0L, 97.0d, 10.0f, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 0.0, 97.0, 10.0, 0.0]");
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray18 = new double[] { (short) -1, 52.0d, 32.0d, (-1L) };
        double[] doubleArray23 = new double[] { 100, 1, 100.0f, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 52.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, 100.0, 52.0]");
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) '4');
        double double21 = iIRFilter1.process(10.0d);
        double[] doubleArray27 = new double[] { '4', 10.0d, (byte) -1, ' ', (short) 10 };
        double[] doubleArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 10.0, -1.0, 32.0, 10.0]");
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10L);
        double double7 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) '#');
        double double19 = iIRFilter1.process((double) (short) -1);
        double double21 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (-1.0f));
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process((double) 10L);
        double double23 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray25 = new double[] { 1 };
        double[] doubleArray31 = new double[] { 100.0d, 10, 0.0f, (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 0.0, 10.0, 10.0]");
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (short) 10);
        double double19 = iIRFilter1.process((double) '#');
        double[] doubleArray23 = new double[] { ' ', (byte) 10, (-1.0d) };
        double[] doubleArray26 = new double[] { (byte) 1, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (short) 1);
        double double21 = iIRFilter1.process((-1.0d));
        double double23 = iIRFilter1.process((double) 0L);
        double double25 = iIRFilter1.process(0.0d);
        double double27 = iIRFilter1.process(100.0d);
        double double29 = iIRFilter1.process((-1.0d));
        double[] doubleArray33 = new double[] { (byte) 0, ' ', 0.0d };
        double[] doubleArray37 = new double[] { (short) 1, 'a', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray33, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 97.0, -1.0]");
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) 1);
        double[] doubleArray13 = new double[] { 35.0d, '4', (-1.0f), 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 52.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0]");
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double double21 = iIRFilter1.process(52.0d);
        double double23 = iIRFilter1.process((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process(10.0d);
        double double21 = iIRFilter1.process((double) 100L);
        double[] doubleArray22 = null;
        double[] doubleArray25 = new double[] { 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, -1.0]");
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(97.0d);
        double[] doubleArray10 = new double[] { 0.0f, 0.0f, 52.0d, 1.0d };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) 0);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 0.0f);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray16 = new double[] { (short) 100, (byte) 0, 1L, 10.0f, 100.0f, 100.0f };
        double[] doubleArray23 = new double[] { (-1), 10, (short) 10, '4', 100, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 0.0, 1.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, 10.0, 52.0, 100.0, 1.0]");
    }

    @Test
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process((double) 100);
        double double21 = iIRFilter1.process((double) '#');
        double[] doubleArray23 = new double[] { (byte) 1 };
        double[] doubleArray29 = new double[] { 10.0d, 10L, 1, (-1.0f), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 10.0, 1.0, -1.0, 1.0]");
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) (short) 0);
        double double15 = iIRFilter1.process((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(97.0d);
        double double17 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process((double) '4');
        double double23 = iIRFilter1.process((double) (short) 10);
        double double25 = iIRFilter1.process(97.0d);
        double double27 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (short) 0);
        double double19 = iIRFilter1.process((double) (short) 10);
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) (short) 10);
        double double25 = iIRFilter1.process((double) (short) 10);
        double double27 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) 1L);
        double[] doubleArray24 = new double[] { (short) -1, ' ', 'a', 97.0d };
        double[] doubleArray26 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 32.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0]");
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) '#');
        double double19 = iIRFilter1.process((double) (short) -1);
        double double21 = iIRFilter1.process((double) (byte) 1);
        double double23 = iIRFilter1.process(97.0d);
        double[] doubleArray26 = new double[] { 32.0d, 100 };
        double[] doubleArray31 = new double[] { 32.0d, (-1L), 97.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, -1.0, 97.0, 0.0]");
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) 1L);
        double double21 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray23 = new double[] { 1 };
        double[] doubleArray28 = new double[] { 97.0d, 32.0d, '#', 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 32.0, 35.0, 1.0]");
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process(10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process(32.0d);
        double double21 = iIRFilter1.process((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (byte) 10);
        double double21 = iIRFilter1.process((double) 1L);
        double double23 = iIRFilter1.process((double) (-1L));
        double double25 = iIRFilter1.process(0.0d);
        double double27 = iIRFilter1.process((double) 0L);
        double double29 = iIRFilter1.process((double) (short) 10);
        double double31 = iIRFilter1.process((double) (-1.0f));
        double double33 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (-1L));
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(97.0d);
        double double17 = iIRFilter1.process((double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) '#');
        double double19 = iIRFilter1.process((double) (short) -1);
        double double21 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray28 = new double[] { (byte) 100, (-1L), 52.0d, (-1), 'a', 100.0d };
        double[] doubleArray30 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, -1.0, 52.0, -1.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0]");
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (short) 0);
        double double15 = iIRFilter1.process((double) '#');
        double double17 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process(32.0d);
        double double19 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(32.0d);
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process((double) 10L);
        double[] doubleArray23 = new double[] { (short) -1, 10.0f, (short) 10, 0L, 1.0d };
        double[] doubleArray24 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, 10.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process(100.0d);
        double[] doubleArray14 = new double[] { 0.0f, (short) 0 };
        double[] doubleArray17 = new double[] { 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, -1.0]");
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) 1L);
        double double11 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process(0.0d);
        double[] doubleArray22 = new double[] { (byte) 0, (byte) 0, 10.0f, 1.0f };
        double[] doubleArray29 = new double[] { 100L, 1, (byte) 10, (byte) -1, 1L, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 1.0, 10.0, -1.0, 1.0, 100.0]");
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process(0.0d);
        double[] doubleArray11 = new double[] { (byte) 1, 0.0f, (-1.0f) };
        double[] doubleArray18 = new double[] { 10.0d, (-1), (byte) 1, (short) 10, 'a', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 1.0, 10.0, 97.0, 100.0]");
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (short) 1);
        double double9 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double[] doubleArray19 = new double[] { 35.0d, 10.0f, 10.0f, 0.0f, 0L };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 10.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(100.0d);
        double[] doubleArray15 = new double[] { (byte) 10, 100, 0.0f };
        double[] doubleArray21 = new double[] { 0L, 52.0d, '#', (-1), 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 52.0, 35.0, -1.0, 97.0]");
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process(100.0d);
        double double21 = iIRFilter1.process(0.0d);
        double[] doubleArray25 = new double[] { (-1.0f), 10.0f, 52.0d };
        double[] doubleArray27 = new double[] { 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0]");
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) '#');
        double[] doubleArray19 = new double[] { 1L, (short) -1, (byte) -1 };
        double[] doubleArray23 = new double[] { 32.0d, 100L, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 100.0, 97.0]");
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process(97.0d);
        double double9 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) (-1.0f));
        double double21 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (byte) 10);
        double double21 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray28 = new double[] { (byte) 0, 100L, 0L, 100.0f, '#', 'a' };
        double[] doubleArray35 = new double[] { (-1), (short) -1, 1, 0.0f, (byte) 100, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 100.0, 0.0, 100.0, 35.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 1.0, 0.0, 100.0, 100.0]");
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) '4');
        double double21 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) 0.0f);
        double double9 = iIRFilter1.process(97.0d);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray19 = new double[] { 'a', 35.0d, 10.0f, 1L, 100 };
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 35.0, 10.0, 1.0, 100.0]");
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray21 = new double[] { 0, '#', 52.0d };
        double[] doubleArray23 = new double[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 35.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 100.0f);
        double double17 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8113");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process(52.0d);
        double double21 = iIRFilter1.process((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8114");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 0L);
        double[] doubleArray14 = new double[] { 1, (byte) 1 };
        double[] doubleArray21 = new double[] { (short) -1, (short) 1, (byte) 10, 0L, ' ', 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 10.0, 0.0, 32.0, 0.0]");
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8115");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) 100L);
        double double21 = iIRFilter1.process((double) (-1));
        double[] doubleArray23 = new double[] { (-1.0d) };
        double[] doubleArray24 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8116");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray23 = new double[] { 'a', (short) 1, (short) 100, 97.0d, 0L };
        double[] doubleArray26 = new double[] { (-1.0d), 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 1.0, 100.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0]");
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8117");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(52.0d);
        double double15 = iIRFilter1.process((double) (byte) 100);
        double double17 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8118");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process((-1.0d));
        double[] doubleArray21 = new double[] { '4' };
        double[] doubleArray23 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8119");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process(35.0d);
        double[] doubleArray10 = new double[] { (byte) 100, (-1) };
        double[] doubleArray12 = new double[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8120");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process(100.0d);
        double double19 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8121");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) 1);
        double double21 = iIRFilter1.process((double) 10L);
        double double23 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray25 = new double[] { (byte) -1 };
        double[] doubleArray26 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8122");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process((double) '4');
        double double15 = iIRFilter1.process((double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8123");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) (byte) 1);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8124");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process(97.0d);
        double[] doubleArray15 = new double[] { 1.0d };
        double[] doubleArray17 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0]");
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8125");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double double19 = iIRFilter1.process((double) 0L);
        double double21 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8126");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray18 = new double[] { 100.0f, (byte) 0 };
        double[] doubleArray24 = new double[] { (short) 10, 0L, 1L, '#', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 0.0, 1.0, 35.0, 100.0]");
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8127");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8128");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (short) 0);
        double double15 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8129");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { (-1), 10L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 10.0, -1.0]");
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8130");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8131");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process(1.0d);
        double[] doubleArray21 = new double[] { 32.0d, (byte) 0, 10, 0.0d, ' ' };
        double[] doubleArray27 = new double[] { 0.0f, (short) 1, (short) 0, 1.0d, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 0.0, 10.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0, 0.0, 1.0, 0.0]");
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8132");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process(10.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process(32.0d);
        double double19 = iIRFilter1.process((double) 0.0f);
        double double21 = iIRFilter1.process(52.0d);
        double double23 = iIRFilter1.process((double) '4');
        double double25 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8133");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray19 = new double[] { (byte) 0 };
        double[] doubleArray25 = new double[] { 'a', 1.0d, 52.0d, (byte) 0, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0, 1.0, 52.0, 0.0, -1.0]");
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8134");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8135");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) (-1));
        double[] doubleArray12 = new double[] {};
        double[] doubleArray15 = new double[] { ' ', 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0, 100.0]");
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8136");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8137");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) (-1L));
        double double21 = iIRFilter1.process(35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8138");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(0.0d);
        double[] doubleArray11 = new double[] { (byte) 1, (short) 10, 52.0d };
        double[] doubleArray15 = new double[] { (-1L), (-1), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 100.0]");
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8139");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray16 = new double[] { 97.0d, 0.0f, 10L, 10.0d, (-1), (byte) 1 };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 0.0, 10.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8140");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process((double) 1);
        double double19 = iIRFilter1.process((double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8141");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 0);
        double[] doubleArray11 = new double[] { 0L, 97.0d, (short) 100, (byte) -1, 10 };
        double[] doubleArray13 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 97.0, 100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8142");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) ' ');
        double[] doubleArray14 = new double[] { (byte) -1, 1, 100, 32.0d };
        double[] doubleArray20 = new double[] { '#', (byte) 0, 100L, 0.0f, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 0.0, 100.0, 0.0, 32.0]");
    }

    @Test
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8143");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process((double) 10L);
        double[] doubleArray19 = new double[] { (byte) 1 };
        double[] doubleArray22 = new double[] { 52.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 10.0]");
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8144");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process((double) (-1L));
        double[] doubleArray13 = new double[] { '4', 10.0f, (byte) 10 };
        double[] doubleArray18 = new double[] { '#', 1L, (short) 0, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, 1.0, 0.0, 10.0]");
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8145");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) 1L);
        double[] doubleArray17 = new double[] { 100L, 0L, 100.0d, 0L, 35.0d };
        double[] doubleArray19 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 0.0, 100.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8146");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double double11 = iIRFilter1.process((double) (-1));
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0]");
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8147");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process(1.0d);
        double[] doubleArray16 = new double[] { (-1L), 100L, 100.0f, (-1.0d) };
        double[] doubleArray19 = new double[] { (byte) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 52.0]");
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8148");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (-1L));
        double[] doubleArray14 = null;
        double[] doubleArray17 = new double[] { (byte) 100, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0]");
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8149");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8150");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) ' ');
        double double13 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray14 = null;
        double[] doubleArray21 = new double[] { 10.0f, 1.0f, (-1), (-1L), '4', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 1.0, -1.0, -1.0, 52.0, 10.0]");
    }

    @Test
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8151");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) (short) -1);
        double double5 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray10 = new double[] { '#', (short) 0, (-1.0f), (short) 10 };
        double[] doubleArray16 = new double[] { 10.0f, 32.0d, '4', 10L, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 32.0, 52.0, 10.0, 100.0]");
    }

    @Test
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8152");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8153");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8154");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process(100.0d);
        double double19 = iIRFilter1.process(0.0d);
        double[] doubleArray26 = new double[] { 10, 1.0d, (short) -1, (short) 100, (-1.0f), (-1) };
        double[] doubleArray28 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, -1.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0]");
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8155");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process(35.0d);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process((double) (short) 0);
        double double23 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8156");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process(100.0d);
        double[] doubleArray25 = new double[] { 10L, 10.0d, 1.0f, 1, (-1) };
        double[] doubleArray27 = new double[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8157");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) (-1.0f));
        double double21 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray26 = new double[] { (short) 0, (byte) 0, 10.0f, (byte) 0 };
        double[] doubleArray33 = new double[] { 0, '#', (short) -1, 10.0d, 1.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 35.0, -1.0, 10.0, 1.0, 100.0]");
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8158");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) (-1.0f));
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process((double) (-1L));
        double[] doubleArray18 = new double[] { (byte) 0, '#' };
        double[] doubleArray25 = new double[] { (-1), 0.0f, (-1.0d), (byte) 100, 100.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, -1.0, 100.0, 100.0, 35.0]");
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8159");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8160");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process((double) (short) 100);
        double double11 = iIRFilter1.process((double) 0L);
        double[] doubleArray16 = new double[] { 10, 0L, (byte) 100, 0.0d };
        double[] doubleArray19 = new double[] { (-1.0f), (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0]");
    }

    @Test
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8161");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray20 = null;
        double[] doubleArray24 = new double[] { 1, (short) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 1.0, 0.0]");
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8162");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (byte) 10);
        double double21 = iIRFilter1.process((double) 1L);
        double double23 = iIRFilter1.process((double) (byte) 1);
        double double25 = iIRFilter1.process((double) '4');
        double double27 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8163");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) '#');
        double double19 = iIRFilter1.process((double) (short) -1);
        double double21 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray25 = new double[] { '4', 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 100.0]");
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8164");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 100);
        double[] doubleArray22 = new double[] { 35.0d, 1.0f, 10.0f, 1, 10.0f, 1L };
        double[] doubleArray23 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 1.0, 10.0, 1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8165");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8166");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) 0.0f);
        double double21 = iIRFilter1.process((double) 0);
        double double23 = iIRFilter1.process((double) (byte) 1);
        double double25 = iIRFilter1.process((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8167");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process((double) (-1.0f));
        double double19 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8168");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process((double) 100.0f);
        double double19 = iIRFilter1.process((double) 0);
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8169");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) (short) 10);
        double double17 = iIRFilter1.process((double) (short) 10);
        double double19 = iIRFilter1.process(0.0d);
        double[] doubleArray25 = new double[] { (short) 1, 100, (byte) 0, 0L, '#' };
        double[] doubleArray29 = new double[] { 10, '4', 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, 0.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 35.0]");
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8170");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) 100);
        double double17 = iIRFilter1.process(10.0d);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray22 = new double[] { 32.0d, 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 97.0, 32.0]");
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8171");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8172");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8173");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { '#', 0.0d, (short) 10, 1.0f, 100.0f, 0L };
        double[] doubleArray18 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 0.0, 10.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0]");
    }

    @Test
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8174");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process(10.0d);
        double[] doubleArray15 = new double[] { 10.0d, '4', (byte) 1 };
        double[] doubleArray20 = new double[] { (byte) 10, 100L, 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0, 10.0, -1.0]");
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8175");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process(32.0d);
        double double21 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8176");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process(10.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process(32.0d);
        double double19 = iIRFilter1.process((double) 0.0f);
        double double21 = iIRFilter1.process(52.0d);
        double double23 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8177");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (-1L));
        double double19 = iIRFilter1.process((double) '4');
        double double21 = iIRFilter1.process((double) (short) 100);
        double double23 = iIRFilter1.process((double) (byte) 0);
        double double25 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test8178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8178");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test8179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8179");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test8180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8180");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(97.0d);
        double double9 = iIRFilter1.process((double) 1);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process(52.0d);
        double[] doubleArray15 = new double[] { 32.0d };
        double[] doubleArray17 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
    }

    @Test
    public void test8181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8181");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process(100.0d);
        double[] doubleArray13 = new double[] { 1, 10.0d, (-1L) };
        double[] doubleArray15 = new double[] { 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0]");
    }

    @Test
    public void test8182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8182");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process((double) 1L);
        double[] doubleArray24 = new double[] { 52.0d, (byte) 100, (short) 10, (-1.0f), (short) -1, (-1L) };
        double[] doubleArray26 = new double[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[52.0, 100.0, 10.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[32.0]");
    }

    @Test
    public void test8183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8183");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process((double) 1);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8184");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8185");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test8186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8186");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) 10);
        double double17 = iIRFilter1.process(32.0d);
        double[] doubleArray24 = new double[] { 1L, '4', 100L, 0.0f, 'a', (short) 1 };
        double[] doubleArray28 = new double[] { ' ', 10.0f, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 52.0, 100.0, 0.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 10.0, 100.0]");
    }

    @Test
    public void test8187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8187");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (short) 10);
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test8188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8188");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process(35.0d);
        double double17 = iIRFilter1.process((double) (short) 100);
        double double19 = iIRFilter1.process((double) (short) 1);
        double double21 = iIRFilter1.process((double) 0L);
        double[] doubleArray23 = new double[] { (short) 10 };
        double[] doubleArray26 = new double[] { 10.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0]");
    }

    @Test
    public void test8189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8189");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double double19 = iIRFilter1.process((double) 10L);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test8190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8190");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test8191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8191");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test8192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8192");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (short) 0);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
    }

    @Test
    public void test8193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8193");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test8194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8194");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double double21 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8195");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8196");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test8197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8197");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) (short) 10);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) (byte) 100);
        double double21 = iIRFilter1.process((double) (-1));
        double double23 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8198");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
    }

    @Test
    public void test8199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8199");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8200");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process((double) 10L);
        double double19 = iIRFilter1.process((-1.0d));
        double[] doubleArray21 = new double[] { 10 };
        double[] doubleArray28 = new double[] { (byte) 1, (-1), (byte) 100, (short) 10, (byte) 0, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, -1.0, 100.0, 10.0, 0.0, 10.0]");
    }

    @Test
    public void test8201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8201");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) 1.0f);
        double double21 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8202");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process(1.0d);
        double double15 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test8203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8203");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process(35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test8204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8204");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test8205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8205");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 1);
        double[] doubleArray18 = new double[] { 10L, 0 };
        double[] doubleArray23 = new double[] { 100.0f, 32.0d, 1L, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 32.0, 1.0, -1.0]");
    }

    @Test
    public void test8206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8206");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) 1);
        double[] doubleArray18 = null;
        double[] doubleArray22 = new double[] { 1.0f, 0.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 0.0, 10.0]");
    }

    @Test
    public void test8207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8207");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) (short) 100);
        double double21 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test8208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8208");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process((double) (byte) -1);
        double double19 = iIRFilter1.process((double) (-1.0f));
        double double21 = iIRFilter1.process((double) (-1));
        double[] doubleArray24 = new double[] { ' ', 1L };
        double[] doubleArray29 = new double[] { (byte) 10, 100, (-1.0d), 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 100.0, -1.0, 0.0]");
    }

    @Test
    public void test8209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8209");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test8210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8210");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test8211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8211");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 1);
        double[] doubleArray23 = new double[] { (short) 1, 1, (byte) 0, 100, (short) 100 };
        double[] doubleArray26 = new double[] { 52.0d, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, 100.0]");
    }

    @Test
    public void test8212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8212");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) '4');
        double[] doubleArray25 = new double[] { (short) 0, 97.0d, (byte) 1, 0.0d, 'a' };
        double[] doubleArray30 = new double[] { ' ', (byte) -1, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 97.0, 1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0, -1.0, -1.0, -1.0]");
    }

    @Test
    public void test8213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8213");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) '4');
        double double7 = iIRFilter1.process((double) (byte) 100);
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) 10L);
        double[] doubleArray18 = new double[] { 1.0d, (byte) 0, (short) 0, 0.0d, (byte) 1, 32.0d };
        double[] doubleArray22 = new double[] { 0L, '4', 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 0.0, 0.0, 0.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 52.0, 52.0]");
    }

    @Test
    public void test8214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8214");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8215");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (byte) 0);
        double double17 = iIRFilter1.process((double) 100.0f);
        double double19 = iIRFilter1.process(10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test8216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8216");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 0);
        double double15 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8217");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process((double) 1);
        double double23 = iIRFilter1.process(52.0d);
        double[] doubleArray26 = new double[] { 100.0f, 0 };
        double[] doubleArray28 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0]");
    }

    @Test
    public void test8218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8218");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (short) 100);
        double double11 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test8219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8219");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8220");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) 1);
        double double21 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray25 = new double[] { 10L, 1L, (byte) 10 };
        double[] doubleArray32 = new double[] { (-1L), ' ', 1L, 100.0f, (byte) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 32.0, 1.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test8221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8221");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double double21 = iIRFilter1.process((double) (short) 0);
        double double23 = iIRFilter1.process(0.0d);
        double[] doubleArray25 = new double[] { 'a' };
        double[] doubleArray27 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0]");
    }

    @Test
    public void test8222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8222");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (short) -1);
        double double5 = iIRFilter1.process((double) 'a');
        double double7 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test8223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8223");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) 100);
        double double17 = iIRFilter1.process(10.0d);
        double double19 = iIRFilter1.process((double) 100.0f);
        double double21 = iIRFilter1.process((double) 100.0f);
        double double23 = iIRFilter1.process(35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
    }

    @Test
    public void test8224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8224");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = null;
        double[] doubleArray20 = new double[] { (-1.0f), '4', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 52.0, 100.0]");
    }

    @Test
    public void test8225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8225");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray16 = new double[] { (byte) 0, 100.0d, 100.0d, (short) 100, 1, 'a' };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 100.0, 100.0, 1.0, 97.0]");
    }

    @Test
    public void test8226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8226");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8227");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) (short) -1);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) 0L);
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) 100L);
        double double25 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test8228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8228");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test8229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8229");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1);
        double[] doubleArray16 = new double[] { (byte) 1, 10L, 0, 1L, (byte) 10, (-1) };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 0.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test8230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8230");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) 100L);
        double double17 = iIRFilter1.process((double) (-1.0f));
        double double19 = iIRFilter1.process(97.0d);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test8231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8231");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double[] doubleArray18 = new double[] { 0.0f, (short) 0, 100.0d, (short) 1 };
        double[] doubleArray22 = new double[] { 35.0d, 1.0d, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 1.0, 10.0]");
    }

    @Test
    public void test8232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8232");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray22 = new double[] { 1.0f, (byte) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 10.0, 1.0]");
    }

    @Test
    public void test8233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8233");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process(1.0d);
        double[] doubleArray12 = new double[] { ' ', (byte) 0, 'a', (-1L) };
        double[] doubleArray14 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 0.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
    }

    @Test
    public void test8234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8234");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
    }

    @Test
    public void test8235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8235");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test8236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8236");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test8237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8237");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process((double) ' ');
        double double21 = iIRFilter1.process((double) 100L);
        double double23 = iIRFilter1.process((double) 1);
        double double25 = iIRFilter1.process((double) (-1));
        double[] doubleArray30 = new double[] { 100, '#', 35.0d, 32.0d };
        double[] doubleArray31 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray30, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 35.0, 35.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
    }

    @Test
    public void test8238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8238");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) 100.0f);
        double double19 = iIRFilter1.process((double) 100L);
        double double21 = iIRFilter1.process((double) 1.0f);
        double double23 = iIRFilter1.process((double) (-1));
        double double25 = iIRFilter1.process((double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test8239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8239");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray12 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0]");
    }

    @Test
    public void test8240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8240");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8241");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) ' ');
        double double13 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8242");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray18 = new double[] { 0, 52.0d, 52.0d, 1 };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 52.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test8243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8243");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test8244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8244");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8245");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8246");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process((double) '4');
        double double23 = iIRFilter1.process((double) (short) 10);
        double double25 = iIRFilter1.process(97.0d);
        double double27 = iIRFilter1.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass28 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8247");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process(32.0d);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray14 = new double[] { (byte) 1, 100, 97.0d, '4' };
        double[] doubleArray20 = new double[] { (short) 10, (byte) -1, ' ', (byte) 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 32.0, 10.0, 10.0]");
    }

    @Test
    public void test8248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8248");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test8249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8249");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8250");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((-1.0d));
        double[] doubleArray24 = new double[] { 100L, (-1.0f), 52.0d, (-1L), 1, 0 };
        double[] doubleArray30 = new double[] { '#', 100L, 35.0d, 97.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, -1.0, 52.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 100.0, 35.0, 97.0, 100.0]");
    }

    @Test
    public void test8251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8251");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) (byte) 100);
        double double15 = iIRFilter1.process((double) (short) 10);
        double double17 = iIRFilter1.process((double) 1L);
        double double19 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8252");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process(100.0d);
        double double21 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8253");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double[] doubleArray6 = new double[] { 1.0f, '4' };
        double[] doubleArray12 = new double[] { 100.0d, 0L, (byte) 1, (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 0.0, 1.0, 100.0, 100.0]");
    }

    @Test
    public void test8254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8254");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test8255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8255");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray25 = new double[] { 100.0f, 35.0d, (short) -1, (short) 1, (byte) 10 };
        double[] doubleArray27 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 35.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0]");
    }

    @Test
    public void test8256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8256");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test8257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8257");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((double) (-1.0f));
        double double7 = iIRFilter1.process((double) 0.0f);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test8258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8258");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8259");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test8260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8260");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(32.0d);
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test8261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8261");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray15 = new double[] { (byte) 10, (byte) 1, (short) 10 };
        double[] doubleArray18 = new double[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 35.0]");
    }

    @Test
    public void test8262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8262");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray19 = new double[] { '#' };
        double[] doubleArray21 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
    }

    @Test
    public void test8263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8263");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process((double) 1);
        double[] doubleArray26 = new double[] { '4', (short) 0, 1.0f, (-1) };
        double[] doubleArray28 = new double[] { 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[52.0]");
    }

    @Test
    public void test8264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8264");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) 100);
        double[] doubleArray21 = new double[] { 1.0f };
        double[] doubleArray22 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test8265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8265");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 100.0f);
        double double11 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8266");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process(100.0d);
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test8267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8267");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test8268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8268");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8269");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test8270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8270");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test8271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8271");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) 1L);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) 'a');
        double[] doubleArray21 = new double[] { 100, (byte) -1, (byte) 1, ' ', 100 };
        double[] doubleArray22 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, -1.0, 1.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test8272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8272");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(10.0d);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8273");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(32.0d);
        double double5 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test8274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8274");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8275");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double double21 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8276");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 100L);
        double double17 = iIRFilter1.process((double) (-1));
        double double19 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test8277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8277");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) 1L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8278");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (byte) 100);
        double double11 = iIRFilter1.process((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test8279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8279");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process(52.0d);
        double[] doubleArray12 = new double[] { 'a', 100.0f, (short) 1, 35.0d };
        double[] doubleArray15 = new double[] { 1.0f, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 100.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, -1.0]");
    }

    @Test
    public void test8280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8280");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) 1);
        double double17 = iIRFilter1.process((double) 0.0f);
        double double19 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8281");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test8282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8282");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test8283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8283");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test8284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8284");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 1);
        double double19 = iIRFilter1.process(52.0d);
        double double21 = iIRFilter1.process((double) (-1));
        double double23 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8285");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (short) 1);
        double double21 = iIRFilter1.process((-1.0d));
        double double23 = iIRFilter1.process((double) 0L);
        double double25 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass26 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8286");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) ' ');
        double[] doubleArray19 = new double[] { 52.0d, '#', 0.0d };
        double[] doubleArray21 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
    }

    @Test
    public void test8287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8287");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process(10.0d);
        double double21 = iIRFilter1.process(1.0d);
        double double23 = iIRFilter1.process((double) (short) 1);
        double double25 = iIRFilter1.process((double) (-1));
        double double27 = iIRFilter1.process((double) 1L);
        double double29 = iIRFilter1.process((double) 'a');
        double[] doubleArray36 = new double[] { 10.0f, (short) 100, 35.0d, (-1L), 10.0f, (short) 1 };
        double[] doubleArray37 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray36, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 100.0, 35.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
    }

    @Test
    public void test8288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8288");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process(1.0d);
        double[] doubleArray16 = new double[] { (short) 10, 100.0f, (short) -1, (byte) -1, (short) 100, (byte) 0 };
        double[] doubleArray19 = new double[] { 100L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0, -1.0, -1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 0.0]");
    }

    @Test
    public void test8289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8289");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) 100L);
        double[] doubleArray21 = new double[] { 1.0d, 100.0d, (-1), 'a', 10.0d };
        double[] doubleArray23 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, -1.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
    }

    @Test
    public void test8290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8290");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8291");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 1L);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test8292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8292");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8293");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double double21 = iIRFilter1.process(97.0d);
        double double23 = iIRFilter1.process(0.0d);
        double[] doubleArray28 = new double[] { (short) 10, (short) 1, 35.0d, 100.0f };
        double[] doubleArray32 = new double[] { 52.0d, 0.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 1.0, 35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[52.0, 0.0, 100.0]");
    }

    @Test
    public void test8294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8294");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process(0.0d);
        double[] doubleArray18 = null;
        double[] doubleArray25 = new double[] { 10L, (-1L), 10.0f, 97.0d, 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0, 10.0, 97.0, 10.0, 1.0]");
    }

    @Test
    public void test8295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8295");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process((double) ' ');
        double double21 = iIRFilter1.process((double) 1L);
        double[] doubleArray22 = null;
        double[] doubleArray26 = new double[] { (short) 10, (short) 100, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0, 35.0]");
    }

    @Test
    public void test8296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8296");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) (short) 10);
        double double21 = iIRFilter1.process((double) (short) 10);
        double double23 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test8297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8297");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) (short) 10);
        double double17 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test8298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8298");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) 1L);
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8299");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process(0.0d);
        double[] doubleArray19 = new double[] { (-1) };
        double[] doubleArray21 = new double[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0]");
    }

    @Test
    public void test8300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8300");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process(35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test8301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8301");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process(52.0d);
        double double19 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test8302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8302");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (short) 10);
        double double19 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray24 = new double[] { (-1L), (byte) 0, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 97.0]");
    }

    @Test
    public void test8303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8303");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8304");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test8305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8305");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test8306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8306");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 100L);
        double double17 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8307");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process(35.0d);
        double double21 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test8308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8308");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test8309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8309");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8310");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process(35.0d);
        double double7 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8311");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray13 = new double[] { (-1.0d), '4', 32.0d };
        double[] doubleArray15 = new double[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 52.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
    }

    @Test
    public void test8312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8312");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process((double) (-1L));
        double double19 = iIRFilter1.process((double) (-1L));
        double[] doubleArray25 = new double[] { (-1.0f), (byte) 100, (-1), ' ', 1.0d };
        double[] doubleArray32 = new double[] { '#', 10L, 35.0d, ' ', 10.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, -1.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[35.0, 10.0, 35.0, 32.0, 10.0, 0.0]");
    }

    @Test
    public void test8313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8313");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process(97.0d);
        double double17 = iIRFilter1.process(52.0d);
        double double19 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test8314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8314");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8315");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 100.0f);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process((double) '4');
        double[] doubleArray26 = new double[] { (byte) 100, 1, (byte) 0, 32.0d, (-1.0d), (byte) 10 };
        double[] doubleArray33 = new double[] { 1, 1.0f, 10L, 10.0f, '#', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0, 0.0, 32.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 1.0, 10.0, 10.0, 35.0, 10.0]");
    }

    @Test
    public void test8316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8316");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process((double) '4');
        double[] doubleArray20 = new double[] { 10.0f, '#' };
        double[] doubleArray26 = new double[] { (byte) 1, (short) 100, (byte) 100, 10L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, 100.0, 10.0, 0.0]");
    }

    @Test
    public void test8317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8317");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8318");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double double19 = iIRFilter1.process((double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test8319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8319");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process((double) 1);
        double double21 = iIRFilter1.process(97.0d);
        double double23 = iIRFilter1.process(32.0d);
        double double25 = iIRFilter1.process((-1.0d));
        double double27 = iIRFilter1.process((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 32.0d + "'", double23 == 32.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test8320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8320");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process((double) 100.0f);
        double double21 = iIRFilter1.process(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test8321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8321");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(97.0d);
        double double9 = iIRFilter1.process((double) 1);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process((double) 0L);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray19 = new double[] { 35.0d, 52.0d, (byte) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 52.0, 100.0, 10.0]");
    }

    @Test
    public void test8322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8322");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process(32.0d);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray15 = new double[] { 0.0d, 35.0d, 100, (-1), '4' };
        double[] doubleArray21 = new double[] { 0.0f, (short) 0, (short) -1, (short) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 35.0, 100.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, -1.0, 10.0, 1.0]");
    }

    @Test
    public void test8323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8323");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test8324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8324");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray10 = new double[] { 0L, 100 };
        double[] doubleArray17 = new double[] { (short) 100, '#', (byte) 0, 0.0f, (-1), 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 35.0, 0.0, 0.0, -1.0, 32.0]");
    }

    @Test
    public void test8325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8325");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process(10.0d);
        double double11 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test8326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8326");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double double19 = iIRFilter1.process((double) 0L);
        double double21 = iIRFilter1.process((double) 0.0f);
        double double23 = iIRFilter1.process((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test8327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8327");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test8328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8328");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process((double) (byte) 0);
        double double19 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test8329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8329");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) 100L);
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test8330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8330");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process(52.0d);
        double double19 = iIRFilter1.process((double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test8331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8331");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray23 = new double[] { (-1.0d), 0.0f, (short) 10, 97.0d, 97.0d };
        double[] doubleArray30 = new double[] { (-1), ' ', (byte) 10, (short) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 10.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 32.0, 10.0, 0.0, 10.0, 100.0]");
    }

    @Test
    public void test8332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8332");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (short) 1);
        double double9 = iIRFilter1.process((double) 1);
        double double11 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8333");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (short) 1);
        double double21 = iIRFilter1.process((-1.0d));
        double double23 = iIRFilter1.process((double) 0L);
        double double25 = iIRFilter1.process(0.0d);
        double double27 = iIRFilter1.process(100.0d);
        double double29 = iIRFilter1.process((-1.0d));
        double double31 = iIRFilter1.process((double) (byte) 100);
        double double33 = iIRFilter1.process((double) 0L);
        double double35 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test8334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8334");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process((double) 10L);
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) (short) 1);
        double double25 = iIRFilter1.process(10.0d);
        double[] doubleArray31 = new double[] { (byte) 10, 10.0f, 'a', 1L, 35.0d };
        double[] doubleArray37 = new double[] { ' ', '#', 100, 0.0d, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray31, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 97.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[32.0, 35.0, 100.0, 0.0, 100.0]");
    }

    @Test
    public void test8335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8335");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process((double) '#');
        double[] doubleArray22 = new double[] { 52.0d, (short) 1, '4', (-1L) };
        double[] doubleArray25 = new double[] { 52.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 1.0]");
    }

    @Test
    public void test8336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8336");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test8337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8337");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) 10L);
        double double19 = iIRFilter1.process((double) '4');
        double[] doubleArray20 = null;
        double[] doubleArray23 = new double[] { (short) 100, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0]");
    }

    @Test
    public void test8338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8338");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process(1.0d);
        double[] doubleArray13 = new double[] { (byte) -1 };
        double[] doubleArray18 = new double[] { 0.0f, 10.0d, 1, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 10.0, 1.0, 32.0]");
    }

    @Test
    public void test8339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8339");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test8340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8340");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process(10.0d);
        double double21 = iIRFilter1.process((double) (byte) -1);
        double double23 = iIRFilter1.process((double) 100L);
        double double25 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass26 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8341");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) ' ');
        double[] doubleArray10 = new double[] {};
        double[] doubleArray17 = new double[] { (short) 100, 1.0f, 100.0f, (-1.0f), 52.0d, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, 100.0, -1.0, 52.0, 1.0]");
    }

    @Test
    public void test8342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8342");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8343");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(35.0d);
        double[] doubleArray16 = new double[] { 35.0d, (short) 100, 10.0d, (short) 100 };
        double[] doubleArray19 = new double[] { 10.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0]");
    }

    @Test
    public void test8344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8344");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process((double) 1);
        double double7 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test8345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8345");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) (-1L));
        double[] doubleArray21 = new double[] { ' ', 1L, 10, (short) 1, 0.0f };
        double[] doubleArray24 = new double[] { (-1L), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 1.0, 10.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 1.0]");
    }

    @Test
    public void test8346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8346");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (short) 1);
        double double21 = iIRFilter1.process((-1.0d));
        double double23 = iIRFilter1.process((double) 0L);
        double double25 = iIRFilter1.process(0.0d);
        double double27 = iIRFilter1.process(100.0d);
        double double29 = iIRFilter1.process((-1.0d));
        double double31 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass32 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test8347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8347");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process((double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
    }

    @Test
    public void test8348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8348");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(1.0d);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test8349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8349");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test8350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8350");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test8351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8351");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (short) 10);
        double double15 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8352");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test8353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8353");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test8354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8354");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray13 = new double[] { (short) 1 };
        double[] doubleArray16 = new double[] { 35.0d, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 97.0]");
    }

    @Test
    public void test8355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8355");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(32.0d);
        double double7 = iIRFilter1.process((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test8356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8356");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process((double) '4');
        double[] doubleArray23 = new double[] { 10.0d };
        double[] doubleArray25 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
    }

    @Test
    public void test8357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8357");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray13 = new double[] { (-1.0d), (byte) 100, (byte) 10 };
        double[] doubleArray20 = new double[] { 10L, (short) -1, 100.0f, 32.0d, 1.0d, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 100.0, 32.0, 1.0, 10.0]");
    }

    @Test
    public void test8358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8358");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8359");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray17 = new double[] { (short) 0, 1L, 10L };
        double[] doubleArray22 = new double[] { 1.0f, 100, (byte) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0, 100.0, 10.0]");
    }

    @Test
    public void test8360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8360");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test8361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8361");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1L));
        double[] doubleArray14 = new double[] { 0, (-1.0d) };
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, -1.0]");
    }

    @Test
    public void test8362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8362");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) 100.0f);
        double double19 = iIRFilter1.process((double) (byte) -1);
        double double21 = iIRFilter1.process((double) (short) 10);
        double double23 = iIRFilter1.process(0.0d);
        double double25 = iIRFilter1.process(0.0d);
        double double27 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test8363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8363");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) ' ');
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8364");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (byte) -1);
        double double19 = iIRFilter1.process((double) 100);
        double[] doubleArray20 = null;
        double[] doubleArray22 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
    }

    @Test
    public void test8365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8365");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test8366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8366");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8367");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8368");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process(32.0d);
        double[] doubleArray26 = new double[] { (byte) 100, 1.0f, 10.0d, (byte) 100, 0.0f, 1L };
        double[] doubleArray32 = new double[] { (short) 0, 100.0d, 0.0d, 0.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0, 10.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 100.0, 0.0, 0.0, -1.0]");
    }

    @Test
    public void test8369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8369");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        double double5 = iIRFilter1.process((double) 100);
        double double7 = iIRFilter1.process((double) 1L);
        double[] doubleArray13 = new double[] { 35.0d, (-1.0d), 'a', 100L, (short) 0 };
        double[] doubleArray20 = new double[] { 0.0d, ' ', 0, 10, 10.0d, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, -1.0, 97.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 32.0, 0.0, 10.0, 10.0, 52.0]");
    }

    @Test
    public void test8370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8370");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(32.0d);
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8371");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) (byte) 100);
        double double11 = iIRFilter1.process((double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test8372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8372");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8373");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process((double) (-1L));
        double[] doubleArray26 = new double[] { 97.0d, 0, 100.0d, 0, '#', (byte) 1 };
        double[] doubleArray31 = new double[] { 0, ' ', (byte) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 0.0, 100.0, 0.0, 35.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 32.0, -1.0, 52.0]");
    }

    @Test
    public void test8374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8374");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process((double) 10);
        double double21 = iIRFilter1.process((double) 1);
        double double23 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test8375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8375");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) ' ');
        double double11 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8376");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test8377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8377");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8378");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double[] doubleArray9 = new double[] { 32.0d };
        double[] doubleArray11 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0]");
    }

    @Test
    public void test8379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8379");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(97.0d);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process(10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test8380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8380");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 0L);
        double[] doubleArray17 = new double[] { (-1.0d), 100L, (short) 10, 0L, 1 };
        double[] doubleArray24 = new double[] { (-1), 100L, '4', '4', 1L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 10.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 52.0, 52.0, 1.0, 10.0]");
    }

    @Test
    public void test8381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8381");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process(32.0d);
        double double19 = iIRFilter1.process((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test8382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8382");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process(0.0d);
        double[] doubleArray20 = new double[] { (byte) 0, (byte) 1 };
        double[] doubleArray22 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0]");
    }

    @Test
    public void test8383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8383");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 10);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test8384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8384");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process(1.0d);
        double[] doubleArray18 = new double[] { 10.0f, 0.0d, (byte) 100, 100 };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test8385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8385");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8386");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray21 = new double[] { 1, 32.0d, (-1.0f), 0L, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (-1.0d), 10.0f, 'a', 1, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 32.0, -1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 10.0, 97.0, 1.0, 52.0]");
    }

    @Test
    public void test8387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8387");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test8388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8388");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8389");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process(32.0d);
        double double19 = iIRFilter1.process((-1.0d));
        double[] doubleArray20 = new double[] {};
        double[] doubleArray22 = new double[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
    }

    @Test
    public void test8390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8390");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray14 = null;
        double[] doubleArray17 = new double[] { 32.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 0.0]");
    }

    @Test
    public void test8391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8391");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8392");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process(100.0d);
        double[] doubleArray25 = new double[] { 97.0d, (-1.0f), 10, 10.0f, 32.0d };
        double[] doubleArray31 = new double[] { (byte) 100, 0L, (short) 0, (-1L), 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0, -1.0, 10.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 0.0, 0.0, -1.0, 1.0]");
    }

    @Test
    public void test8393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8393");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double[] doubleArray14 = new double[] { 1.0f, (short) 10 };
        double[] doubleArray19 = new double[] { (byte) 1, (short) 10, '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 35.0, 100.0]");
    }

    @Test
    public void test8394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8394");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test8395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8395");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test8396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8396");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test8397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8397");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process(10.0d);
        double double21 = iIRFilter1.process((double) (byte) -1);
        double double23 = iIRFilter1.process((double) 100L);
        double double25 = iIRFilter1.process((double) (byte) 10);
        double double27 = iIRFilter1.process((double) 0.0f);
        double double29 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test8398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8398");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (short) 100);
        double double19 = iIRFilter1.process((double) (byte) 100);
        double double21 = iIRFilter1.process((double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test8399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8399");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8400");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 1);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8401");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process((double) 0);
        double double15 = iIRFilter1.process((double) (-1L));
        double double17 = iIRFilter1.process(10.0d);
        double double19 = iIRFilter1.process((double) 10L);
        double[] doubleArray23 = new double[] { 32.0d, 1L, 100 };
        double[] doubleArray30 = new double[] { '4', 0, 10.0f, (-1L), (-1), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[52.0, 0.0, 10.0, -1.0, -1.0, 100.0]");
    }

    @Test
    public void test8402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8402");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test8403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8403");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) 100L);
        double double21 = iIRFilter1.process((double) (-1));
        double double23 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8404");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) '4');
        double double21 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test8405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8405");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((double) 100.0f);
        double double11 = iIRFilter1.process(35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test8406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8406");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 100L);
        double double17 = iIRFilter1.process((double) (-1));
        double[] doubleArray23 = new double[] { 10, (short) 10, (short) 10, 0.0f, 10 };
        double[] doubleArray27 = new double[] { 0, (-1L), 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 10.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, -1.0, 35.0]");
    }

    @Test
    public void test8407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8407");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process((double) '#');
        double[] doubleArray15 = new double[] { 52.0d, 10.0f, (short) 0, 10, (short) -1 };
        double[] doubleArray20 = new double[] { '#', 52.0d, (-1L), 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, 10.0, 0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 52.0, -1.0, 1.0]");
    }

    @Test
    public void test8408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8408");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(52.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 100.0f);
        double double19 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test8409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8409");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { 'a', (byte) 1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 1.0, -1.0]");
    }

    @Test
    public void test8410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8410");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test8411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8411");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process(35.0d);
        double double19 = iIRFilter1.process((double) (short) 0);
        double double21 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8412");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test8413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8413");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) (short) 10);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) 100.0f);
        double double21 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test8414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8414");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray13 = new double[] { 52.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 100.0]");
    }

    @Test
    public void test8415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8415");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(1.0d);
        double[] doubleArray15 = new double[] { (byte) 10 };
        double[] doubleArray19 = new double[] { 32.0d, (-1.0d), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, -1.0, 100.0]");
    }

    @Test
    public void test8416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8416");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8417");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) ' ');
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) 10L);
        double[] doubleArray17 = new double[] { (short) 1 };
        double[] doubleArray19 = new double[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0]");
    }

    @Test
    public void test8418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8418");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray22 = new double[] { (short) 1, (short) 10, 100, (byte) 1 };
        double[] doubleArray24 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0]");
    }

    @Test
    public void test8419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8419");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(10.0d);
        double[] doubleArray9 = new double[] { (short) -1 };
        double[] doubleArray16 = new double[] { '#', (-1.0f), (short) 1, (short) 10, 1, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bCoeffs must be of size 1, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, -1.0, 1.0, 10.0, 1.0, 97.0]");
    }

    @Test
    public void test8420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8420");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 1);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test8421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8421");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test8422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8422");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) (byte) 0);
        double double21 = iIRFilter1.process((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test8423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8423");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) (byte) 0);
        double double21 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test8424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8424");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test8425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8425");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test8426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8426");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8427");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test8428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8428");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 0.0f);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double double11 = iIRFilter1.process((double) 100L);
        double double13 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8429");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray17 = new double[] { '4', (byte) 10, 0L, (byte) 1, 0L };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, 10.0, 0.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test8430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8430");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8431");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) 10L);
        double double21 = iIRFilter1.process((double) 'a');
        double double23 = iIRFilter1.process((double) 100);
        double double25 = iIRFilter1.process((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test8432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8432");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) 10);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
    }

    @Test
    public void test8433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8433");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test8434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8434");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(97.0d);
        double double9 = iIRFilter1.process((double) (short) 100);
        double double11 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test8435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8435");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (short) 10);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test8436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8436");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process(10.0d);
        double double19 = iIRFilter1.process(32.0d);
        double double21 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8437");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process(10.0d);
        double double21 = iIRFilter1.process((double) (byte) -1);
        double double23 = iIRFilter1.process((double) 100L);
        double double25 = iIRFilter1.process((double) (byte) 10);
        double double27 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass28 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8438");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 'a');
        double[] doubleArray19 = new double[] { 0 };
        double[] doubleArray26 = new double[] { 100L, 35.0d, (short) 0, ' ', 10.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 35.0, 0.0, 32.0, 10.0, 35.0]");
    }

    @Test
    public void test8439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8439");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) '4');
        double double7 = iIRFilter1.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8440");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test8441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8441");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process((double) 100.0f);
        double double19 = iIRFilter1.process((double) 0);
        double double21 = iIRFilter1.process((double) 1.0f);
        double double23 = iIRFilter1.process((double) (-1));
        double double25 = iIRFilter1.process((double) 0L);
        double[] doubleArray31 = new double[] { (-1), ' ', (-1.0d), 1.0f, 10 };
        double[] doubleArray34 = new double[] { 0.0f, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray31, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 32.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0]");
    }

    @Test
    public void test8442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8442");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 100.0f);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray20 = null;
        double[] doubleArray24 = new double[] { '4', 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[52.0, 0.0, 100.0]");
    }

    @Test
    public void test8443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8443");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) (short) 0);
        double double19 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test8444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8444");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process(97.0d);
        double[] doubleArray17 = new double[] { 10 };
        double[] doubleArray19 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0]");
    }

    @Test
    public void test8445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8445");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test8446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8446");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray20 = new double[] { 0.0d, (byte) 100, (short) 100, (-1L) };
        double[] doubleArray27 = new double[] { 1.0d, (short) 100, (-1), 10.0f, (short) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, -1.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test8447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8447");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8448");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) 1L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) 'a');
        double[] doubleArray19 = new double[] { 32.0d, (-1), 0.0f, 32.0d, (-1L) };
        double[] doubleArray25 = new double[] { (short) 1, (byte) -1, (short) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, -1.0, 0.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0, 100.0, 0.0, 0.0]");
    }

    @Test
    public void test8449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8449");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test8450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8450");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 100L);
        double double17 = iIRFilter1.process((double) (-1));
        double double19 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8451");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test8452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8452");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((-1.0d));
        double[] doubleArray16 = new double[] { (short) 0, (byte) 0, 100L, 10 };
        double[] doubleArray23 = new double[] { (short) -1, (byte) 10, (byte) 10, 0.0f, 1.0f, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, 10.0, 0.0, 1.0, 97.0]");
    }

    @Test
    public void test8453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8453");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test8454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8454");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) 1L);
        double[] doubleArray14 = new double[] { (byte) -1, 'a', (short) 100, (short) 1 };
        double[] doubleArray17 = new double[] { 100L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 97.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0]");
    }

    @Test
    public void test8455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8455");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 1L);
        double[] doubleArray22 = new double[] { 52.0d, (short) 10, 100.0f, (byte) 1, 32.0d, 0.0f };
        double[] doubleArray26 = new double[] { 0L, 0L, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 10.0, 100.0, 1.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 0.0, 1.0]");
    }

    @Test
    public void test8456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8456");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double double21 = iIRFilter1.process(52.0d);
        double double23 = iIRFilter1.process((double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test8457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8457");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) (-1L));
        double[] doubleArray22 = new double[] { 0.0f, (-1) };
        double[] doubleArray25 = new double[] { 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0]");
    }

    @Test
    public void test8458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8458");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) (short) 10);
        double double21 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8459");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) (-1.0f));
        double double19 = iIRFilter1.process((double) (short) 0);
        double double21 = iIRFilter1.process((double) 'a');
        double[] doubleArray26 = new double[] { 1.0d, (-1.0f), 1L, 32.0d };
        double[] doubleArray32 = new double[] { 32.0d, (byte) 100, (byte) 100, (byte) 10, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, -1.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 100.0, 100.0, 10.0, -1.0]");
    }

    @Test
    public void test8460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8460");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test8461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8461");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8462");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test8463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8463");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double[] doubleArray15 = new double[] { 10L };
        double[] doubleArray22 = new double[] { 10, (byte) 0, 0.0f, 0, 100.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 0.0, 0.0, 0.0, 100.0, 32.0]");
    }

    @Test
    public void test8464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8464");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0.0f);
        double double9 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test8465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8465");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double double19 = iIRFilter1.process(10.0d);
        double double21 = iIRFilter1.process(1.0d);
        double double23 = iIRFilter1.process((double) (short) 1);
        double double25 = iIRFilter1.process((double) (-1));
        double double27 = iIRFilter1.process((double) '4');
        double double29 = iIRFilter1.process((double) 10);
        double double31 = iIRFilter1.process((double) 10L);
        double[] doubleArray33 = new double[] { 10.0d };
        double[] doubleArray35 = new double[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray33, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0]");
    }

    @Test
    public void test8466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8466");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 10);
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) 10.0f);
        double double21 = iIRFilter1.process((double) 1L);
        double double23 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test8467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8467");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test8468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8468");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) '#');
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
    }

    @Test
    public void test8469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8469");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray18 = null;
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test8470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8470");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((-1.0d));
        double[] doubleArray25 = new double[] { (short) 10, (short) -1, 1L, '4', 10.0f };
        double[] doubleArray32 = new double[] { (short) 1, (-1), 35.0d, (short) -1, 1L, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0, 1.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, -1.0, 35.0, -1.0, 1.0, -1.0]");
    }

    @Test
    public void test8471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8471");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) 1);
        double double17 = iIRFilter1.process((double) 100);
        double double19 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test8472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8472");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (short) -1);
        double double17 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8473");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) '4');
        double double7 = iIRFilter1.process((double) (byte) 100);
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test8474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8474");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10);
        double[] doubleArray9 = new double[] { 97.0d, 10.0d, (byte) 10 };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }
}

