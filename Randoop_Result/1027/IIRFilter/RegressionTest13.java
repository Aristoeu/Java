package IIRFilter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray18 = new double[] { (short) 0, (short) 0 };
        double[] doubleArray22 = new double[] { 100.0f, 100.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 10.0]");
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) '4');
        double[] doubleArray19 = new double[] { 35.0d, (-1.0f), '#' };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double[] doubleArray10 = new double[] { (byte) 10, 1.0f };
        double[] doubleArray17 = new double[] { 10L, (-1), 0, (-1.0d), 32.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0, 0.0, -1.0, 32.0, 35.0]");
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray19 = new double[] { 10, (short) 10, (-1.0d) };
        double[] doubleArray23 = new double[] { 52.0d, 0L, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, 0.0, 1.0]");
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { 'a', (byte) 100 };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 100);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray10 = new double[] { (short) 10, (-1L), 1.0f, 35.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0, 1.0, 35.0, 1.0]");
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) '4');
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray20 = new double[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0]");
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
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
        double double21 = iIRFilter1.process((double) (-1L));
        double double23 = iIRFilter1.process((double) 100);
        double double25 = iIRFilter1.process((double) (byte) -1);
        double double27 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) (short) 100);
        double double21 = iIRFilter1.process((-1.0d));
        double[] doubleArray28 = new double[] { (-1.0d), 1.0d, 100.0d, 10L, 32.0d, 32.0d };
        double[] doubleArray32 = new double[] { 32.0d, 'a', 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray32);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 1.0, 100.0, 10.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 97.0, 35.0]");
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) '#');
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process(97.0d);
        double double21 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray25 = new double[] { 100.0d, (short) -1, (short) -1 };
        double[] doubleArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, -1.0, -1.0]");
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
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
        double double21 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process((double) 0);
        double[] doubleArray14 = null;
        double[] doubleArray21 = new double[] { (short) -1, (-1.0f), 100, 1.0d, 97.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 1.0, 97.0, 100.0]");
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) (-1L));
        double double21 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (short) 0);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray21 = new double[] { (byte) 0 };
        double[] doubleArray24 = new double[] { 100L, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 10.0]");
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 'a');
        double[] doubleArray21 = new double[] { (short) -1, (-1.0f), (byte) -1, 10.0d, 1.0d };
        double[] doubleArray27 = new double[] { 10L, 'a', (-1.0f), 0L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 97.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray18 = new double[] { (-1.0f), 0.0d, 0, 0L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 0.0, 0.0, -1.0]");
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray19 = new double[] { (-1.0f), 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0]");
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(1.0d);
        double double7 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
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
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
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
        double double25 = iIRFilter1.process((double) (-1));
        double double27 = iIRFilter1.process(100.0d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        double double5 = iIRFilter1.process((double) 100);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1L);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process((double) '#');
        double[] doubleArray17 = new double[] { (short) 1 };
        double[] doubleArray23 = new double[] { '#', 35.0d, 1.0d, (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, 35.0, 1.0, -1.0, 1.0]");
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((double) 100.0f);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray19 = new double[] { (short) 10, 100.0f, 100.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0, 100.0, 10.0]");
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) 0);
        double double21 = iIRFilter1.process(35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process(97.0d);
        double[] doubleArray17 = new double[] { 100.0d, 10, (-1.0d) };
        double[] doubleArray22 = new double[] { (short) 1, (-1.0d), 100.0f, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, -1.0, 100.0, 100.0]");
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray14 = new double[] { (-1), 10L };
        double[] doubleArray16 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) '4');
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { 100.0d, (short) 100, 100L, 1, 10.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 1);
        double[] doubleArray13 = new double[] { ' ', 10.0f, 1L };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) 10L);
        double[] doubleArray17 = new double[] { 0.0f, (-1L), 1.0d, 35.0d, 0.0f };
        double[] doubleArray20 = new double[] { (-1.0f), 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, -1.0, 1.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0]");
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
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
        double double21 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray15 = new double[] { (-1.0f) };
        double[] doubleArray22 = new double[] { 32.0d, 10.0f, 97.0d, 100L, 1.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 10.0, 97.0, 100.0, 1.0, 10.0]");
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray8 = new double[] { 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[52.0]");
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray16 = new double[] { (byte) 1, 1L };
        double[] doubleArray19 = new double[] { '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, -1.0]");
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process(52.0d);
        double double21 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process(32.0d);
        double[] doubleArray17 = new double[] { 1.0f, '#', '4' };
        double[] doubleArray22 = new double[] { (byte) 10, (short) 10, 0.0f, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 35.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 0.0, 100.0]");
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process((double) 1L);
        double double21 = iIRFilter1.process(52.0d);
        double double23 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray22 = new double[] { (byte) -1, (-1.0f), 0.0d, (short) 100, 0L, 100 };
        double[] doubleArray26 = new double[] { 97.0d, 0.0f, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 0.0, 100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 0.0, 97.0]");
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 10);
        double double9 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray16 = new double[] { 0.0d, (byte) 10, (short) 1, 0L, 10L, (byte) 10 };
        double[] doubleArray20 = new double[] { 97.0d, 52.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 10.0, 1.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 52.0, 32.0]");
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray20 = new double[] { 1L, '4' };
        double[] doubleArray27 = new double[] { (short) 1, (byte) 10, 10, (short) 1, (short) 100, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0, 10.0, 1.0, 100.0, 0.0]");
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process((double) (byte) 1);
        double double21 = iIRFilter1.process((double) 'a');
        double double23 = iIRFilter1.process((double) (-1));
        double double25 = iIRFilter1.process((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) (byte) 0);
        double double21 = iIRFilter1.process((double) (short) 10);
        double double23 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray25 = new double[] { 1L };
        double[] doubleArray32 = new double[] { (short) -1, 100.0f, 32.0d, (short) 0, (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 100.0, 32.0, 0.0, -1.0, 1.0]");
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
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
        double[] doubleArray28 = new double[] { 100, (byte) 100, (short) -1, (byte) 100, (short) 0, (byte) 1 };
        double[] doubleArray35 = new double[] { 10, (short) 10, (short) -1, (short) 100, 32.0d, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, -1.0, 100.0, 32.0, 52.0]");
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(35.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (short) 10);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (short) 100);
        double double19 = iIRFilter1.process((double) 10L);
        double[] doubleArray22 = new double[] { (-1.0f), 97.0d };
        double[] doubleArray28 = new double[] { 1.0d, 10L, 0.0f, 32.0d, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0, 0.0, 32.0, 1.0]");
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray19 = new double[] { '4', (short) 0, 32.0d };
        double[] doubleArray23 = new double[] { (short) 10, 97.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 97.0, -1.0]");
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
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
        double double23 = iIRFilter1.process(35.0d);
        double double25 = iIRFilter1.process((-1.0d));
        double double27 = iIRFilter1.process((double) (short) 100);
        double double29 = iIRFilter1.process((double) 0);
        double double31 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass32 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 1L);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { 0, (-1), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, -1.0, 100.0]");
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process((double) (byte) 1);
        double double21 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10);
        double[] doubleArray12 = new double[] { (byte) 100, 1L, (short) -1, 100.0f, 0.0f, (-1.0d) };
        double[] doubleArray17 = new double[] { 'a', 52.0d, (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0, 100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 52.0, 0.0, 100.0]");
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) 0L);
        double[] doubleArray23 = new double[] { 10L, 0.0d, 10.0f, 1.0f, 100.0d };
        double[] doubleArray27 = new double[] { 10, (-1), (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 0.0, 10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, -1.0, -1.0]");
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) 100);
        double[] doubleArray23 = new double[] { (byte) 1, (short) -1, 52.0d, 35.0d, (byte) 10 };
        double[] doubleArray28 = new double[] { ' ', 1.0f, (short) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, -1.0, 52.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 1.0, -1.0, 10.0]");
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray15 = new double[] { (short) 10, 100L, (short) 1, (byte) 100, 100 };
        double[] doubleArray22 = new double[] { 100.0f, 0L, (short) 10, (short) 0, (short) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0, 10.0, 0.0, 10.0, 100.0]");
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) (short) 0);
        double double19 = iIRFilter1.process(100.0d);
        double[] doubleArray22 = new double[] { (byte) -1, ' ' };
        double[] doubleArray29 = new double[] { 10, (byte) 1, 10L, ' ', 32.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 1.0, 10.0, 32.0, 32.0, 35.0]");
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double[] doubleArray7 = new double[] { (short) 10, 97.0d, (byte) 10 };
        double[] doubleArray8 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double double19 = iIRFilter1.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
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
        double[] doubleArray25 = new double[] { (byte) 1 };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (short) 0);
        double double15 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray18 = new double[] { 100L, 52.0d };
        double[] doubleArray22 = new double[] { 32.0d, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 100.0, 1.0]");
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 100);
        double[] doubleArray13 = new double[] { 0.0f, 32.0d, (-1L), (byte) 10, (byte) 10 };
        double[] doubleArray18 = new double[] { 0.0d, 100.0f, (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 32.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process(35.0d);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray25 = new double[] { (short) 10, (short) -1, (short) 1, (byte) 1, (short) 10 };
        double[] doubleArray32 = new double[] { (byte) -1, 10.0d, (short) 10, (short) 0, 1L, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 10.0, 10.0, 0.0, 1.0, 32.0]");
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray22 = new double[] { 32.0d, 1L, (short) -1, (byte) -1, (byte) -1, ' ' };
        double[] doubleArray28 = new double[] { (-1L), (short) 100, '#', 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 1.0, -1.0, -1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 100.0, 35.0, 100.0, 0.0]");
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) (byte) 0);
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process(1.0d);
        double double21 = iIRFilter1.process(32.0d);
        double double23 = iIRFilter1.process((double) (-1L));
        double double25 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process(1.0d);
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
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
        double double23 = iIRFilter1.process(35.0d);
        double double25 = iIRFilter1.process((-1.0d));
        double double27 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray29 = new double[] { 52.0d };
        double[] doubleArray30 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray29, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray15 = new double[] { 100L, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0]");
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray17 = new double[] { '4', 10L, 'a', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, 10.0, 97.0, 1.0]");
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray9 = new double[] { (short) 1, 10, (short) 1 };
        double[] doubleArray16 = new double[] { 0.0d, 0.0f, (-1L), 35.0d, 32.0d, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, -1.0, 35.0, 32.0, 97.0]");
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
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
        double double23 = iIRFilter1.process((double) (short) 10);
        double double25 = iIRFilter1.process((double) (byte) 1);
        double double27 = iIRFilter1.process((double) (-1L));
        double double29 = iIRFilter1.process((double) (-1L));
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray17 = new double[] { 35.0d, 10L, 1.0d, 32.0d, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, 10.0, 1.0, 32.0, 97.0, 10.0]");
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
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
        double[] doubleArray21 = new double[] { 97.0d };
        double[] doubleArray23 = new double[] { 35.0d };
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0]");
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0L);
        double[] doubleArray17 = new double[] { (byte) 1, (short) 1, '#', (short) 0, '4' };
        double[] doubleArray20 = new double[] { (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 1.0, 35.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0]");
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 10);
        double[] doubleArray13 = new double[] { (short) 1 };
        double[] doubleArray18 = new double[] { (short) 100, 0.0d, (-1L), '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0, -1.0, 35.0]");
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0f), 100.0f, (short) -1 };
        double[] doubleArray17 = new double[] { 32.0d, (byte) -1, 1.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, -1.0, 1.0, 0.0]");
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
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
        double double25 = iIRFilter1.process((double) 1L);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray28 = new double[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray28);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0]");
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
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
        double double21 = iIRFilter1.process((double) (-1L));
        double double23 = iIRFilter1.process((double) (short) 1);
        double double25 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass26 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray17 = new double[] { 0 };
        double[] doubleArray24 = new double[] { ' ', (short) 0, 100.0d, (byte) -1, 32.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[32.0, 0.0, 100.0, -1.0, 32.0, -1.0]");
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) 100.0f);
        double double21 = iIRFilter1.process(100.0d);
        double double23 = iIRFilter1.process((double) (byte) 1);
        double double25 = iIRFilter1.process(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process((double) (-1));
        double[] doubleArray15 = new double[] { 10L, 10.0d, 52.0d, 100.0d, '4' };
        double[] doubleArray20 = new double[] { 10.0d, (short) 100, (-1.0f), '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, 52.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0, -1.0, 35.0]");
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray9 = new double[] { 1.0d, (byte) 0, (short) 10 };
        double[] doubleArray16 = new double[] { 1, (short) 0, (byte) 1, 100.0f, ' ', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0, 1.0, 100.0, 32.0, -1.0]");
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray17 = new double[] { 0.0f };
        double[] doubleArray22 = new double[] { 100.0d, 100, (short) -1, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, -1.0, 0.0]");
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(32.0d);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) 100.0f);
        double double21 = iIRFilter1.process(100.0d);
        double double23 = iIRFilter1.process((double) (short) 100);
        double double25 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray28 = new double[] { '4', 0L };
        double[] doubleArray30 = new double[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(10.0d);
        double double9 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray16 = new double[] { '4', (-1.0f), 1.0f, (short) -1, (byte) 0, 0L };
        double[] doubleArray20 = new double[] { 100, (short) 10, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 10.0, 1.0]");
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray20 = new double[] { (byte) 10, (-1), (short) 100, 1L };
        double[] doubleArray22 = new double[] { 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0]");
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10L);
        double double19 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray16 = new double[] { (-1.0f), (-1.0f) };
        double[] doubleArray19 = new double[] { 0L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0]");
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0L);
        double[] doubleArray11 = new double[] { ' ' };
        double[] doubleArray15 = new double[] { (-1.0f), 10L, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0]");
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (-1));
        double double13 = iIRFilter1.process((double) 0);
        double double15 = iIRFilter1.process(10.0d);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray17 = new double[] { 0.0d, (short) -1, (short) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, -1.0, 10.0, 32.0]");
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double[] doubleArray16 = new double[] { '4', '#' };
        double[] doubleArray23 = new double[] { (byte) 10, 1, (short) 0, 'a', '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 1.0, 0.0, 97.0, 35.0, -1.0]");
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) (short) 100);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray24 = new double[] { (byte) 100, 52.0d, '#', 52.0d };
        double[] doubleArray30 = new double[] { (short) 100, 35.0d, (short) 10, 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 52.0, 35.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 35.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { 100L, 10L, 1.0d, ' ' };
        double[] doubleArray19 = new double[] { 100L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, -1.0]");
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray15 = new double[] { 52.0d, (byte) -1, 100, 0L, (byte) 10 };
        double[] doubleArray18 = new double[] { (byte) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, -1.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0]");
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray14 = new double[] { (short) 100, 0 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 0.0]");
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray11 = new double[] { (short) 1 };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray12 = new double[] { (byte) 0, 10L, 'a', (-1L) };
        double[] doubleArray18 = new double[] { '4', (-1.0d), 1.0f, 100.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 10.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, -1.0, 1.0, 100.0, 0.0]");
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double[] doubleArray16 = new double[] { 'a', 10.0f, (short) 10, 10L, (byte) 100, 97.0d };
        double[] doubleArray20 = new double[] { 100.0f, 100.0f, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 10.0, 10.0, 10.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 52.0]");
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
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
        double double25 = iIRFilter1.process((double) 10);
        double[] doubleArray30 = new double[] { 100.0f, 1L, (short) 100, (-1L) };
        double[] doubleArray32 = new double[] { 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray30, doubleArray32);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0]");
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 10L);
        double[] doubleArray11 = new double[] { 97.0d, (byte) 0, (byte) 100 };
        double[] doubleArray17 = new double[] { '4', (short) 0, '#', (short) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, 0.0, 35.0, 100.0, 0.0]");
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { 0, '4', (-1.0d), 1.0f, 1.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 52.0, -1.0, 1.0, 1.0, -1.0]");
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { (-1), 100.0f, (-1), 1, (short) 100, (byte) 0 };
        double[] doubleArray21 = new double[] { 35.0d, (-1L), ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, -1.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, -1.0, 32.0, 35.0]");
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) (byte) 100);
        double double15 = iIRFilter1.process((double) (short) 10);
        double double17 = iIRFilter1.process((double) (byte) -1);
        double double19 = iIRFilter1.process((double) (-1));
        double double21 = iIRFilter1.process(100.0d);
        double double23 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(97.0d);
        double[] doubleArray16 = new double[] { 1.0d, (byte) 10 };
        double[] doubleArray23 = new double[] { 100.0d, 1, 10, 35.0d, 35.0d, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, 10.0, 35.0, 35.0, 100.0]");
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
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
        double double25 = iIRFilter1.process((double) 10.0f);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
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
        double double31 = iIRFilter1.process(97.0d);
        double double33 = iIRFilter1.process((double) 100L);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray40 = new double[] { 100.0d, '4', '4', (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray34, doubleArray40);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 97.0d + "'", double31 == 97.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 52.0, 52.0, -1.0, 1.0]");
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) (short) 10);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray9 = new double[] { (byte) -1 };
        double[] doubleArray14 = new double[] { 1, 100.0f, (short) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bCoeffs must be of size 1, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 10.0, 0.0]");
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray24 = new double[] { 100, ' ', 1.0f, (byte) 1, (byte) 100, (byte) -1 };
        double[] doubleArray28 = new double[] { '#', 0.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 32.0, 1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 0.0, 10.0]");
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(32.0d);
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) (-1));
        double double17 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process((double) 1.0f);
        double double21 = iIRFilter1.process((double) ' ');
        double double23 = iIRFilter1.process((double) '4');
        double double25 = iIRFilter1.process((double) (-1));
        double[] doubleArray28 = new double[] { (byte) 100, (byte) -1 };
        double[] doubleArray32 = new double[] { (byte) 10, (byte) 10, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 10.0, -1.0]");
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process((double) '4');
        double[] doubleArray24 = new double[] { 100.0d, (short) -1, 1.0d, ' ' };
        double[] doubleArray27 = new double[] { (byte) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, -1.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 0.0]");
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 0L);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray9 = new double[] { (byte) 10, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0]");
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (short) -1);
        double double5 = iIRFilter1.process((double) 'a');
        double double7 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(1.0d);
        double double15 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (short) -1);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
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
        double double21 = iIRFilter1.process((double) 100);
        double[] doubleArray26 = new double[] { (-1.0f), (byte) 0, 97.0d, 0.0d };
        double[] doubleArray30 = new double[] { (short) 0, ' ', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 32.0, -1.0]");
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
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
        double double21 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
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
        double double21 = iIRFilter1.process((double) 100);
        double[] doubleArray24 = new double[] { 10, 0.0f };
        double[] doubleArray27 = new double[] { 1L, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0]");
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process((double) (-1L));
        double double21 = iIRFilter1.process(100.0d);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray24 = new double[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0]");
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
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
        double double25 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass26 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
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
        double[] doubleArray26 = new double[] { 0.0f, '4', 0.0d, (byte) 0, (short) 1, 1 };
        double[] doubleArray30 = new double[] { (-1), (-1), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 52.0, 0.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 0.0]");
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
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
        double double27 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass28 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray7 = new double[] { 10.0f };
        double[] doubleArray8 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(32.0d);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray20 = new double[] { 1, (short) 10, 100.0f, 52.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 10.0, 100.0, 52.0, 100.0]");
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray22 = new double[] { (short) 0, 100.0d, (byte) -1, (byte) 0, 52.0d, (byte) 10 };
        double[] doubleArray24 = new double[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 100.0, -1.0, 0.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0]");
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process(100.0d);
        double double19 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process((double) 1);
        double[] doubleArray25 = new double[] { (byte) 1, 100.0d, (short) 1, (short) -1, (-1) };
        double[] doubleArray30 = new double[] { (byte) -1, ' ', 1.0f, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 32.0, 1.0, -1.0]");
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process(10.0d);
        double[] doubleArray25 = new double[] { 35.0d, 1.0f, (byte) -1, '#', 0L };
        double[] doubleArray32 = new double[] { 100.0d, 1, (byte) 100, (byte) 10, (short) 0, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[35.0, 1.0, -1.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, 100.0, 10.0, 0.0, 1.0]");
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
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
        double double23 = iIRFilter1.process((double) 100.0f);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
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
        double double21 = iIRFilter1.process((double) 100L);
        double[] doubleArray27 = new double[] { (short) 1, 100, 0L, 32.0d, 1L };
        double[] doubleArray28 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray28);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, 0.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 1.0f, (byte) 10 };
        double[] doubleArray27 = new double[] { 1L, 32.0d, (byte) 10, (byte) 100, 1L, (byte) 1 };
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 32.0, 10.0, 100.0, 1.0, 1.0]");
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray10 = new double[] { 1.0d, (short) 0, 100L, 100L, (byte) 10, 100 };
        double[] doubleArray14 = new double[] { (-1), 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0, 100.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 35.0]");
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 0);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process(32.0d);
        double double21 = iIRFilter1.process((double) ' ');
        double[] doubleArray25 = new double[] { 100.0d, 32.0d, (short) -1 };
        double[] doubleArray27 = new double[] { 97.0d };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0]");
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) ' ');
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray19 = new double[] { (-1.0d), (short) 1, 100.0d, (-1.0f), 32.0d };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0, 100.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process(52.0d);
        double[] doubleArray22 = new double[] { 10.0d, (-1), 0L, 35.0d, (byte) 1, (-1L) };
        double[] doubleArray24 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0, 0.0, 35.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0]");
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process(35.0d);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((-1.0d));
        double[] doubleArray11 = new double[] { (short) -1, 'a', 32.0d, 0, 1.0d };
        double[] doubleArray14 = new double[] { 1.0d, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 97.0, 32.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray8 = new double[] { 1.0d, '4' };
        double[] doubleArray15 = new double[] { 100.0d, 100L, (byte) -1, 10L, 0.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 100.0, -1.0, 10.0, 0.0, 10.0]");
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1));
        double double13 = iIRFilter1.process((double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) '#');
        double double21 = iIRFilter1.process((double) 10L);
        double[] doubleArray23 = new double[] { 100.0d };
        double[] doubleArray27 = new double[] { ' ', 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[32.0, 0.0, 0.0]");
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(10.0d);
        double double13 = iIRFilter1.process((double) (-1));
        double[] doubleArray16 = new double[] { 32.0d, 52.0d };
        double[] doubleArray19 = new double[] { 1L, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 32.0]");
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) '#');
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process(97.0d);
        double double21 = iIRFilter1.process((double) 100.0f);
        double double23 = iIRFilter1.process((double) '#');
        double double25 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) 0);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) 100L);
        double double19 = iIRFilter1.process((double) (short) 0);
        double double21 = iIRFilter1.process((double) (short) 1);
        double double23 = iIRFilter1.process((double) 1);
        double[] doubleArray28 = new double[] { (-1L), '4', (byte) 0, 0L };
        double[] doubleArray30 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 52.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0]");
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) (short) 0);
        double double21 = iIRFilter1.process((double) 100);
        double double23 = iIRFilter1.process(0.0d);
        double double25 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass26 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
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
        double double23 = iIRFilter1.process((double) (short) 10);
        double double25 = iIRFilter1.process((double) (-1.0f));
        double double27 = iIRFilter1.process(0.0d);
        double[] doubleArray29 = new double[] { 1L };
        double[] doubleArray34 = new double[] { 100L, (-1L), 97.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray29, doubleArray34);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, -1.0, 97.0, -1.0]");
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process(35.0d);
        double double17 = iIRFilter1.process(10.0d);
        double double19 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (short) 10);
        double double19 = iIRFilter1.process(0.0d);
        double[] doubleArray26 = new double[] { (short) -1, 100.0d, (byte) 10, 10.0f, '#', 1.0f };
        double[] doubleArray29 = new double[] { 100L, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 10.0, 10.0, 35.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 1.0]");
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) 1);
        double double11 = iIRFilter1.process((double) (-1L));
        double[] doubleArray14 = new double[] { (-1L), 1 };
        double[] doubleArray18 = new double[] { 100L, (-1.0f), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, -1.0, 1.0]");
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
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
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 32.0d + "'", double23 == 32.0d);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process(35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray24 = new double[] { 100.0f, 1.0d, (short) 0, (byte) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 1.0, 0.0, 0.0, 97.0]");
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
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
        double double23 = iIRFilter1.process((double) (-1L));
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) (short) 0);
        double double21 = iIRFilter1.process((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(97.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray17 = new double[] { 100.0f, 10.0d, (-1.0d), ' ', (byte) 10, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, -1.0, 32.0, 10.0, -1.0]");
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((double) (-1.0f));
        double double7 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
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
        double double21 = iIRFilter1.process((double) (byte) 10);
        double double23 = iIRFilter1.process((double) (byte) 1);
        double double25 = iIRFilter1.process(1.0d);
        double double27 = iIRFilter1.process((double) 'a');
        double[] doubleArray34 = new double[] { 1L, (-1.0d), 1L, 100, 100.0d, 35.0d };
        double[] doubleArray35 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray34, doubleArray35);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, -1.0, 1.0, 100.0, 100.0, 35.0]");
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 10);
        double[] doubleArray22 = new double[] { 100.0d, (-1.0d), '4', 10.0d, (short) 0, 1.0d };
        double[] doubleArray27 = new double[] { (short) 1, 10.0d, 100L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, -1.0, 52.0, 10.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0, 100.0, 10.0]");
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 100);
        double[] doubleArray9 = new double[] { (short) 1 };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double[] doubleArray18 = new double[] { 1.0f, 1.0f, 0.0d, 1.0f };
        double[] doubleArray22 = new double[] { (short) -1, 52.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 52.0, -1.0]");
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process(97.0d);
        double double17 = iIRFilter1.process((double) 0L);
        double[] doubleArray21 = new double[] { 10.0f, 'a', 97.0d };
        double[] doubleArray28 = new double[] { (byte) -1, 1, (short) 1, (byte) -1, '#', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 1.0, 1.0, -1.0, 35.0, 0.0]");
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 1);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(100.0d);
        double[] doubleArray18 = new double[] { 1, 35.0d, (short) 10, (short) 1, 10.0d, (byte) 10 };
        double[] doubleArray23 = new double[] { 1L, 1L, 97.0d, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 35.0, 10.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 1.0, 97.0, 32.0]");
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process(10.0d);
        double[] doubleArray15 = new double[] { 0.0f };
        double[] doubleArray19 = new double[] { 100, 10.0d, 1L };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 1.0]");
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 100L);
        double double19 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray14 = new double[] { 97.0d, 97.0d };
        double[] doubleArray21 = new double[] { 10.0f, 'a', 1.0f, 100.0f, 1.0d, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 97.0, 1.0, 100.0, 1.0, 10.0]");
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process((double) 1L);
        double double19 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double double11 = iIRFilter1.process((double) ' ');
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray14 = new double[] { (byte) -1, 10.0d };
        double[] doubleArray18 = new double[] { (-1.0d), 100.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 35.0]");
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(32.0d);
        double[] doubleArray15 = new double[] { 1.0f, (-1.0f), 100.0f };
        double[] doubleArray22 = new double[] { 1L, (byte) 100, (-1), 52.0d, 0.0f, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0, -1.0, 52.0, 0.0, 100.0]");
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process((double) 0);
        double[] doubleArray15 = new double[] { (-1), (short) 0, 0.0f, (byte) -1, (short) 1 };
        double[] doubleArray17 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 0.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) (byte) 100);
        double double19 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(52.0d);
        double[] doubleArray13 = new double[] { (byte) -1 };
        double[] doubleArray17 = new double[] { (short) 0, 10.0f, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 10.0, 100.0]");
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (short) 0);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process((double) 10L);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray24 = new double[] { 100.0d, 1.0d, 0L, 0.0f, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 1.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray21 = new double[] { (short) 1, 1L, (byte) 100, 100.0f, 0 };
        double[] doubleArray24 = new double[] { (byte) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray24);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 100.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0]");
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process(0.0d);
        double[] doubleArray25 = new double[] { 35.0d, '4', 52.0d, 100, '4' };
        double[] doubleArray31 = new double[] { 100, (-1.0f), 1, (-1L), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[35.0, 52.0, 52.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, -1.0, 1.0, -1.0, 10.0]");
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
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
        double double25 = iIRFilter1.process((double) 10);
        double double27 = iIRFilter1.process((double) (short) 100);
        double double29 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray36 = new double[] { '4', (byte) 100, 52.0d, '#', (byte) 10, 0 };
        double[] doubleArray42 = new double[] { 0, 100, (short) 10, 0L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray36, doubleArray42);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[52.0, 100.0, 52.0, 35.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 100.0, 10.0, 0.0, -1.0]");
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray25 = new double[] { ' ', (short) -1, (-1.0f), 100.0f, 10.0f };
        double[] doubleArray31 = new double[] { 0L, (byte) 100, 0.0f, 35.0d, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, -1.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 100.0, 0.0, 35.0, 1.0]");
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
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
        double double23 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 32.0d + "'", double23 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) 10L);
        double double19 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) 100);
        double double19 = iIRFilter1.process((double) 0);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(32.0d);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { (byte) 1, (-1.0f), 32.0d, 0L, (-1), 0L };
        double[] doubleArray22 = new double[] { 100.0f, 0.0f, (byte) -1, (short) 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 32.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0, -1.0, 10.0, 100.0]");
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) 1.0f);
        double double21 = iIRFilter1.process(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process(10.0d);
        double[] doubleArray24 = new double[] { ' ', '4', 1L, 97.0d, (byte) 10, 10L };
        double[] doubleArray29 = new double[] { 0.0f, (-1L), 35.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[32.0, 52.0, 1.0, 97.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, -1.0, 35.0, -1.0]");
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) (-1.0f));
        double double11 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
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
        double[] doubleArray22 = new double[] { ' ', '4' };
        double[] doubleArray27 = new double[] { 'a', (-1L), 0.0f, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, -1.0, 0.0, 1.0]");
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100L);
        double double13 = iIRFilter1.process((double) 0);
        double double15 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray15 = new double[] { (short) 10, 52.0d, (byte) -1, (-1.0d), (byte) 0 };
        double[] doubleArray19 = new double[] { (-1.0f), 1.0d, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0, 97.0]");
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 1);
        double double19 = iIRFilter1.process((double) '#');
        double[] doubleArray21 = new double[] { 1L };
        double[] doubleArray26 = new double[] { 1.0d, 100L, 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, 1.0, 100.0]");
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 0L);
        double double7 = iIRFilter1.process((double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray12 = null;
        double[] doubleArray18 = new double[] { 10L, 1.0d, 32.0d, ' ', 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0, 32.0, 32.0, 1.0]");
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray13 = new double[] { 100L, 10L, 1L, '#', (short) 10 };
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 1.0, 35.0, 10.0]");
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) '4');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray20 = new double[] { (short) 100, (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, -1.0, 100.0]");
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray17 = new double[] { (-1) };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray14 = new double[] { (-1L), (short) 1 };
        double[] doubleArray18 = new double[] { 10, (-1L), 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0]");
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) '#');
        double[] doubleArray26 = new double[] { (short) 10, 0.0f, 1.0d, 1L, 10.0d, 0.0f };
        double[] doubleArray32 = new double[] { (short) 100, (-1), 0.0f, (byte) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 0.0, 1.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, -1.0, 0.0, 1.0, 0.0]");
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
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
        double double21 = iIRFilter1.process((double) (byte) 10);
        double double23 = iIRFilter1.process((double) (-1.0f));
        double double25 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process(35.0d);
        double[] doubleArray20 = new double[] { (byte) 0, 0.0f, '#', 35.0d };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 35.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray19 = new double[] { (byte) 0, '4', 1.0f, 10.0f, 0L };
        double[] doubleArray24 = new double[] { 10.0f, (short) 100, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 52.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0, 1.0, 10.0]");
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) '4');
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) (-1L));
        double double17 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) 0);
        double double17 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) (-1L));
        double[] doubleArray20 = new double[] { 100.0d, (short) -1, 0, (byte) 10, 1L, (-1) };
        double[] doubleArray27 = new double[] { 35.0d, '4', 10.0d, (byte) 10, 0.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray27);
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, -1.0, 0.0, 10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 52.0, 10.0, 10.0, 0.0, -1.0]");
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) '4');
        double[] doubleArray19 = new double[] { (short) 0, 97.0d, 1.0f, (byte) 10, '#' };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 97.0, 1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
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
        double double25 = iIRFilter1.process((double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) (byte) 100);
        double double15 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) (short) 100);
        double double11 = iIRFilter1.process(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray18 = new double[] { 52.0d, 0, (byte) 100, (byte) 1, 1L, 1 };
        double[] doubleArray20 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 0.0, 100.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
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
        double double29 = iIRFilter1.process((double) 0L);
        double[] doubleArray32 = new double[] { '4', 1.0f };
        double[] doubleArray36 = new double[] { 0L, 0.0f, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray32, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 52.0]");
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 10L);
        double[] doubleArray17 = new double[] { 0L, 10.0d, (short) 10, 1.0d, 'a' };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 10.0, 10.0, 1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) (short) 100);
        double double21 = iIRFilter1.process((-1.0d));
        double double23 = iIRFilter1.process(10.0d);
        double double25 = iIRFilter1.process((double) 'a');
        double double27 = iIRFilter1.process((double) 100L);
        double double29 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass30 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) '4');
        double double15 = iIRFilter1.process((double) 0);
        double double17 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double[] doubleArray16 = new double[] { 32.0d, (short) 1 };
        double[] doubleArray20 = new double[] { 1L, 10.0f, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 10.0, 0.0]");
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
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
        double[] doubleArray25 = new double[] { (short) 1, (byte) -1, 10L, (byte) -1, 1.0d };
        double[] doubleArray28 = new double[] { 97.0d, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 10.0]");
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray24 = new double[] { 97.0d, 0.0f, (-1L), (-1) };
        double[] doubleArray29 = new double[] { 10.0f, (byte) 0, (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 0.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 0.0, -1.0, 100.0]");
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(32.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(35.0d);
        double[] doubleArray13 = new double[] { 1 };
        double[] doubleArray17 = new double[] { (byte) 10, 100L, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 0.0]");
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(10.0d);
        double[] doubleArray19 = new double[] { 0L, 'a', 97.0d, 100, 10 };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 97.0, 97.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) (-1));
        double[] doubleArray12 = new double[] { (short) -1, 100.0d };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) ' ');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray22 = new double[] { 10.0d, (-1), (-1.0d), 0.0f, 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0, -1.0, 0.0, 1.0]");
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
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
        double double21 = iIRFilter1.process(10.0d);
        double double23 = iIRFilter1.process((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) (short) 10);
        double double5 = iIRFilter1.process((double) (-1.0f));
        double double7 = iIRFilter1.process(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
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
        double double23 = iIRFilter1.process((double) (byte) 0);
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
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray10 = new double[] { 1, (byte) 100 };
        double[] doubleArray13 = new double[] { '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, -1.0]");
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
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
        double double25 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray31 = new double[] { 32.0d, 10, 100.0f, ' ', (short) -1 };
        double[] doubleArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray31, doubleArray32);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 10.0, 100.0, 32.0, -1.0]");
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process(35.0d);
        double[] doubleArray20 = new double[] { 10L, (-1.0f), 10.0f, (short) 10, 10L, (byte) -1 };
        double[] doubleArray27 = new double[] { 10L, 1.0d, '4', 100, 32.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 10.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 1.0, 52.0, 100.0, 32.0, 100.0]");
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process((double) (short) 10);
        double double19 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray26 = new double[] { 0, (-1L), 10, (-1L), 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, -1.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) (byte) 1);
        double double11 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 0L);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray19 = new double[] { (byte) 10, '4', 100, 52.0d, 10.0f };
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 100.0, 52.0, 10.0]");
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (-1));
        double[] doubleArray19 = new double[] { 10.0f, (-1L), (short) -1, 97.0d, 'a' };
        double[] doubleArray22 = new double[] { 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, -1.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0]");
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) 0);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray14 = new double[] { 'a', 97.0d };
        double[] doubleArray16 = new double[] { 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0]");
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) 1.0f);
        double double21 = iIRFilter1.process(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray20 = new double[] { (-1.0f), (byte) 0 };
        double[] doubleArray27 = new double[] { 100, ' ', 52.0d, (byte) 1, (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 32.0, 52.0, 1.0, -1.0, 1.0]");
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray21 = new double[] { 0.0d, (byte) 100, 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 100.0, 10.0, -1.0]");
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray19 = new double[] { 100, 0L, 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 0.0, 10.0, -1.0]");
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
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
        double double25 = iIRFilter1.process((double) 10);
        double double27 = iIRFilter1.process((double) (short) 100);
        double double29 = iIRFilter1.process((double) (byte) 10);
        double double31 = iIRFilter1.process((double) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) (byte) 1);
        double double9 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
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
        double[] doubleArray21 = new double[] { (byte) 10 };
        double[] doubleArray23 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0]");
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process(35.0d);
        double[] doubleArray15 = new double[] { 1.0f, '#', 100.0d, 35.0d, ' ' };
        double[] doubleArray22 = new double[] { 1, 32.0d, 35.0d, (byte) 10, (short) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 35.0, 100.0, 35.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 32.0, 35.0, 10.0, 0.0, 52.0]");
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
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
        double double23 = iIRFilter1.process(0.0d);
        double double25 = iIRFilter1.process((double) (short) 1);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) 'a');
        double[] doubleArray16 = new double[] { 35.0d, (-1.0d), (-1), 'a', 10L, (-1L) };
        double[] doubleArray18 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, -1.0, -1.0, 97.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray19 = new double[] { 1.0f, (byte) 1, ' ' };
        double[] doubleArray22 = new double[] { 100.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0]");
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) '#');
        double[] doubleArray11 = new double[] { (byte) 0, 100.0d, ' ' };
        double[] doubleArray15 = new double[] { 'a', 32.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 32.0, 35.0]");
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
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
        double double21 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 10L);
        double[] doubleArray15 = new double[] { 32.0d, ' ', 1.0d };
        double[] doubleArray21 = new double[] { (byte) 0, (-1.0f), 97.0d, 10.0f, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0, 97.0, 10.0, 1.0]");
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray24 = new double[] { (byte) 1, (short) -1, 10.0f, 0.0d };
        double[] doubleArray31 = new double[] { 97.0d, 0.0f, 1.0d, 35.0d, (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 0.0, 1.0, 35.0, 10.0, 0.0]");
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
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
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) '4');
        double double15 = iIRFilter1.process((double) 100.0f);
        double double17 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray22 = new double[] { '#', 0.0f, (short) 100, 100 };
        double[] doubleArray27 = new double[] { 1, 100, 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, 10.0, 10.0]");
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray11 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { (short) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0]");
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
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
        double[] doubleArray20 = null;
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
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
        double[] doubleArray21 = new double[] { (-1.0f) };
        double[] doubleArray27 = new double[] { 0.0d, 1.0f, (-1), 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray27);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(35.0d);
        double[] doubleArray10 = new double[] { 1.0d, 100L };
        double[] doubleArray17 = new double[] { (byte) 100, 10, 'a', 32.0d, 0L, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 97.0, 32.0, 0.0, -1.0]");
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process(1.0d);
        double[] doubleArray15 = new double[] { 35.0d };
        double[] doubleArray22 = new double[] { 52.0d, 35.0d, 0, (short) 0, 0.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 35.0, 0.0, 0.0, 0.0, 1.0]");
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray23 = new double[] { ' ', 100.0d, 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 100.0, 100.0, 0.0]");
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray21 = new double[] { (byte) 1 };
        double[] doubleArray22 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray22 = new double[] { 100, (byte) 1 };
        double[] doubleArray25 = new double[] { 1.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0]");
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray10 = null;
        double[] doubleArray17 = new double[] { (-1.0f), 10L, (short) 100, 10, 97.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, 100.0, 10.0, 97.0, -1.0]");
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray23 = new double[] { 0.0d, 1L, (byte) 1, 100.0f, (short) -1 };
        double[] doubleArray27 = new double[] { (byte) -1, (-1.0d), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0]");
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process(10.0d);
        double[] doubleArray14 = null;
        double[] doubleArray21 = new double[] { (-1L), (-1.0d), ' ', 0L, (-1L), (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 32.0, 0.0, -1.0, -1.0]");
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray18 = new double[] { 1.0f, '#', (-1), 10.0f };
        double[] doubleArray23 = new double[] { (short) 1, (byte) 10, (byte) 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 35.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0, 100.0, -1.0]");
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double[] doubleArray14 = new double[] { 100.0d, 10.0d };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
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
        double[] doubleArray25 = new double[] { 100L, 1.0d, 35.0d };
        double[] doubleArray29 = new double[] { (-1), (-1.0f), 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 97.0]");
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray14 = new double[] { 0.0f, 10.0d };
        double[] doubleArray20 = new double[] { 1.0f, '4', 10, 0.0f, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 52.0, 10.0, 0.0, 100.0]");
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
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
        double double31 = iIRFilter1.process((double) (byte) 100);
        double double33 = iIRFilter1.process((double) '4');
        double double35 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass36 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 52.0d + "'", double33 == 52.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 32.0d + "'", double35 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process((double) 0);
        double[] doubleArray26 = new double[] { '4', 100, 52.0d, 10.0d, 0, '#' };
        double[] doubleArray30 = new double[] { 10L, (short) 1, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, 100.0, 52.0, 10.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 1.0, 10.0]");
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process(10.0d);
        double double19 = iIRFilter1.process(1.0d);
        double[] doubleArray26 = new double[] { (byte) 1, 10.0d, 100L, ' ', (byte) 0, 35.0d };
        double[] doubleArray31 = new double[] { 'a', 1.0d, (byte) 100, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0, 100.0, 32.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 1.0, 100.0, 0.0]");
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 1);
        double[] doubleArray12 = new double[] { '4', 100.0d };
        double[] doubleArray19 = new double[] { (byte) 10, (short) 0, (byte) 0, 10.0f, '#', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0, 0.0, 10.0, 35.0, 10.0]");
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray24 = new double[] { 0.0f, 100L, (-1), ' ', (short) 1, (byte) 10 };
        double[] doubleArray25 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 100.0, -1.0, 32.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (byte) 100);
        double double19 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray25 = new double[] { (-1.0f), (-1L), 1.0d, 100.0d, 100L };
        double[] doubleArray29 = new double[] { 100.0f, ' ', 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 32.0, 0.0]");
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) (byte) -1);
        double double19 = iIRFilter1.process((double) (-1.0f));
        double double21 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 1, '4', 0 };
        double[] doubleArray31 = new double[] { 0L, '4', 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 52.0, 1.0]");
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
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
        double[] doubleArray26 = new double[] { (-1L), '#', 1.0f, (byte) 10, (byte) 100, 100.0f };
        double[] doubleArray29 = new double[] { '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray29);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 35.0, 1.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[35.0, 52.0]");
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) ' ');
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray19 = new double[] { (byte) 0, 1.0d, (byte) -1 };
        double[] doubleArray23 = new double[] { (short) 100, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0, 52.0]");
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray12 = null;
        double[] doubleArray19 = new double[] { 0L, (byte) 0, (-1.0f), 0, 10.0d, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, -1.0, 0.0, 10.0, 35.0]");
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process(97.0d);
        double[] doubleArray24 = new double[] { (-1), 0.0f, 100.0f, 32.0d, 1, 100L };
        double[] doubleArray31 = new double[] { (short) 100, 97.0d, 100.0d, '#', 0L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 100.0, 32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 97.0, 100.0, 35.0, 0.0, 52.0]");
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) 100.0f);
        double double19 = iIRFilter1.process((double) 0L);
        double double21 = iIRFilter1.process((double) 0L);
        double double23 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) 100L);
        double double21 = iIRFilter1.process(1.0d);
        double[] doubleArray28 = new double[] { ' ', 100.0d, 1L, ' ', (short) 10, (-1L) };
        double[] doubleArray31 = new double[] { 10.0f, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 100.0, 1.0, 32.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0]");
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (byte) 0);
        double double5 = iIRFilter1.process((double) (-1));
        double double7 = iIRFilter1.process(1.0d);
        double[] doubleArray10 = new double[] { (short) 1, 0L };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) ' ');
        double double11 = iIRFilter1.process((double) (-1));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray9 = new double[] { 10.0f, (short) 10, 10.0d, 100, '#' };
        double[] doubleArray15 = new double[] { (-1.0d), '#', 0, (byte) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 35.0, 0.0, -1.0, 52.0]");
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(100.0d);
        double[] doubleArray14 = new double[] { '#', ' ', 1L, (short) -1 };
        double[] doubleArray16 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
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
        double double21 = iIRFilter1.process((double) 0.0f);
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
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 0);
        double double15 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process(10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process(10.0d);
        double double19 = iIRFilter1.process(1.0d);
        double double21 = iIRFilter1.process((double) (short) -1);
        double double23 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
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
        double double23 = iIRFilter1.process(10.0d);
        double double25 = iIRFilter1.process((double) 1);
        double double27 = iIRFilter1.process((double) 1.0f);
        double double29 = iIRFilter1.process((double) '#');
        double[] doubleArray36 = new double[] { 100.0d, (byte) 0, (byte) 10, 0, (short) 1, (-1) };
        double[] doubleArray43 = new double[] { 1, 1L, 0, 1L, (short) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray36, doubleArray43);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 35.0d + "'", double29 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 0.0, 10.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 1.0, 0.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) '4');
        double double15 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray13 = new double[] { (-1L) };
        double[] doubleArray19 = new double[] { 0.0f, 32.0d, 10.0d, (-1L), 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 32.0, 10.0, -1.0, 97.0]");
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) '4');
        double[] doubleArray18 = new double[] { 97.0d, 1 };
        double[] doubleArray23 = new double[] { 1L, 52.0d, 97.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 52.0, 97.0, 32.0]");
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) ' ');
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) (short) 100);
        double double21 = iIRFilter1.process((double) 0);
        double double23 = iIRFilter1.process(0.0d);
        double double25 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) 1L);
        double[] doubleArray13 = new double[] { ' ', 100.0d, 100.0f };
        double[] doubleArray20 = new double[] { 100.0f, 52.0d, 100L, '#', (-1.0d), '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 52.0, 100.0, 35.0, -1.0, 52.0]");
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) (-1));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (-1));
        double[] doubleArray14 = new double[] {};
        double[] doubleArray17 = new double[] { (byte) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0]");
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
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
        double double25 = iIRFilter1.process((double) (-1));
        double double27 = iIRFilter1.process((double) (byte) 100);
        double double29 = iIRFilter1.process((double) ' ');
        double double31 = iIRFilter1.process((double) ' ');
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 32.0d + "'", double29 == 32.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 32.0d + "'", double31 == 32.0d);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double[] doubleArray7 = new double[] { 97.0d, ' ', '#', 35.0d, (-1L) };
        double[] doubleArray12 = new double[] { '4', 1.0f, 10.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 32.0, 35.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 1.0, 10.0, 1.0]");
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(32.0d);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray20 = new double[] { 0.0f, (short) 10, 10.0d, '#', 10.0f, 100 };
        double[] doubleArray26 = new double[] { 100L, 'a', 32.0d, 32.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 10.0, 10.0, 35.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 97.0, 32.0, 32.0, 10.0]");
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray18 = new double[] { 100.0f, (byte) 10, 52.0d, 100, (-1L), 0.0f };
        double[] doubleArray20 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 10.0, 52.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) (short) 10);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
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
        double double21 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray27 = new double[] { 100.0f, 10L, 10L, (-1L), (byte) -1 };
        double[] doubleArray29 = new double[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 10.0, 10.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process(10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (short) 10);
        double double19 = iIRFilter1.process(0.0d);
        double[] doubleArray20 = null;
        double[] doubleArray23 = new double[] { 'a', 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 1.0]");
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
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
        double[] doubleArray28 = new double[] {};
        double[] doubleArray31 = new double[] { (byte) -1, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 52.0]");
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
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
        double double21 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray21 = new double[] { 97.0d, (short) 10, (-1.0d), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 10.0, -1.0, 10.0]");
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
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
        double double21 = iIRFilter1.process((double) (short) 0);
        double double23 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) (short) 0);
        double double21 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (short) 10);
        double double19 = iIRFilter1.process(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100L);
        double double13 = iIRFilter1.process((double) '#');
        double[] doubleArray16 = new double[] { (byte) 100, 100L };
        double[] doubleArray18 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
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
        double double21 = iIRFilter1.process((double) (byte) 10);
        double double23 = iIRFilter1.process((double) (byte) 1);
        double double25 = iIRFilter1.process((double) 1);
        double double27 = iIRFilter1.process((double) '#');
        double double29 = iIRFilter1.process(0.0d);
        double[] doubleArray32 = new double[] { 97.0d, 1.0d };
        double[] doubleArray38 = new double[] { (short) 10, (byte) 0, (-1.0d), 100.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray32, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 0.0, -1.0, 100.0, 35.0]");
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process(35.0d);
        double[] doubleArray14 = new double[] { 1.0d, (-1.0d), (short) 100, (short) 1 };
        double[] doubleArray17 = new double[] { 0.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 100.0]");
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
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
        double double27 = iIRFilter1.process(32.0d);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray33 = new double[] { (short) 10, 0.0f, (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray33);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 32.0d + "'", double27 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 0.0, 1.0, 100.0]");
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 0);
        double[] doubleArray16 = new double[] { (-1.0f), (byte) -1, (byte) 100, (short) 10 };
        double[] doubleArray20 = new double[] { 1, 0.0d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 0.0, 0.0]");
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) 0);
        double double11 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process(97.0d);
        double double21 = iIRFilter1.process((double) 10.0f);
        double double23 = iIRFilter1.process((double) 100);
        double double25 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass26 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray17 = new double[] { 97.0d };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray8 = null;
        double[] doubleArray14 = new double[] { (byte) 1, (short) 0, 0.0d, 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, 0.0, 97.0, 97.0]");
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(52.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double[] doubleArray19 = new double[] { (byte) 100, 10.0d, (short) 10 };
        double[] doubleArray25 = new double[] { (byte) -1, (byte) 0, 35.0d, 10.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 35.0, 10.0, 1.0]");
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray10 = null;
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray24 = new double[] { 97.0d, (short) 0, (byte) 0, 'a', 1.0f, 0L };
        double[] doubleArray27 = new double[] { (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 0.0, 0.0, 97.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 35.0]");
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (byte) 100);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process(35.0d);
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) 0L);
        double double25 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double[] doubleArray5 = new double[] { (short) 100 };
        double[] doubleArray9 = new double[] { 35.0d, 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray5, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0, 32.0]");
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double[] doubleArray10 = new double[] { (short) 100, 97.0d };
        double[] doubleArray14 = new double[] { 1.0f, '#', 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 35.0, 100.0]");
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (-1));
        double double13 = iIRFilter1.process((double) 0);
        double[] doubleArray17 = new double[] { 100L, 100L, 1 };
        double[] doubleArray24 = new double[] { (short) 1, 97.0d, 32.0d, (short) 10, 0.0f, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 97.0, 32.0, 10.0, 0.0, 52.0]");
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) (short) 10);
        double double15 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray21 = new double[] { (short) 100, 0L, (short) 100, 1, (byte) 10 };
        double[] doubleArray23 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 0.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0]");
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray20 = new double[] { (short) 100, 1.0d, (short) 1, 10, (short) 100, (-1) };
        double[] doubleArray27 = new double[] { (byte) -1, ' ', (byte) -1, 1.0f, 32.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, 1.0, 10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 32.0, -1.0, 1.0, 32.0, 100.0]");
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
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
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
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
        double double21 = iIRFilter1.process((double) 100L);
        double double23 = iIRFilter1.process((double) (short) 0);
        double double25 = iIRFilter1.process((double) (byte) -1);
        double double27 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass28 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray13 = new double[] { 0L, 1L, 0.0d, 100, 10 };
        double[] doubleArray18 = new double[] { (byte) 0, (byte) 100, (-1), (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0, 0.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 100.0, -1.0, 1.0]");
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 0);
        double double15 = iIRFilter1.process(32.0d);
        double[] doubleArray19 = new double[] { (short) 0, (short) 0, 52.0d };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
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
        double double27 = iIRFilter1.process(0.0d);
        double double29 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray33 = new double[] { 100L, 0.0d, 0.0f };
        double[] doubleArray38 = new double[] { ' ', (byte) -1, 'a', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray33, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[32.0, -1.0, 97.0, 100.0]");
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) (short) -1);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray24 = new double[] { 1.0f, (byte) 0, 0L, 1L };
        double[] doubleArray29 = new double[] { 35.0d, (short) 100, 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[35.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray8 = new double[] { (short) 0, (byte) 10 };
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
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
        double double23 = iIRFilter1.process((double) (short) 10);
        double double25 = iIRFilter1.process((double) 10L);
        double[] doubleArray26 = null;
        double[] doubleArray32 = new double[] { 1.0d, ' ', 1.0d, 35.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray32);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 32.0, 1.0, 35.0, 35.0]");
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray13 = new double[] { 10.0f, (short) -1, '4' };
        double[] doubleArray20 = new double[] { (-1), 10.0f, 'a', (short) 1, '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, 97.0, 1.0, 52.0, 35.0]");
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (short) 100);
        double double11 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray19 = new double[] { (short) 100, 10, 'a', 100, (short) 1 };
        double[] doubleArray23 = new double[] { 0L, 0.0d, 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 97.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 1.0]");
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) (short) 100);
        double double21 = iIRFilter1.process((-1.0d));
        double double23 = iIRFilter1.process(10.0d);
        double double25 = iIRFilter1.process((double) 'a');
        double double27 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass28 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { (byte) 100, 0L, 35.0d, (byte) 10, '4', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 0.0, 35.0, 10.0, 52.0, 0.0]");
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) 'a');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1L);
        double[] doubleArray11 = new double[] { ' ', 1.0f, (short) 0, (-1.0d), (byte) 10 };
        double[] doubleArray14 = new double[] { (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0]");
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) (-1));
        double[] doubleArray9 = new double[] { (short) 0 };
        double[] doubleArray13 = new double[] { 97.0d, 1.0d, 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 1.0, 1.0]");
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) 10);
        double[] doubleArray19 = new double[] { 52.0d };
        double[] doubleArray25 = new double[] { 1.0d, (byte) 10, 0.0f, (-1.0f), 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0, 0.0, -1.0, 10.0]");
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process((double) 1.0f);
        double double21 = iIRFilter1.process((double) ' ');
        double double23 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process(1.0d);
        double double7 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process(0.0d);
        double double21 = iIRFilter1.process((double) 10);
        double[] doubleArray24 = new double[] { 'a', 10 };
        double[] doubleArray28 = new double[] { 1, '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 35.0, 52.0]");
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(52.0d);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(97.0d);
        double double17 = iIRFilter1.process((double) (byte) -1);
        double double19 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 10L);
        double[] doubleArray21 = new double[] { 97.0d, (byte) 1, (-1), 0.0d, 0 };
        double[] doubleArray22 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray22);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 100.0f);
        double double11 = iIRFilter1.process((double) 100L);
        double double13 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10);
        double double9 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 0.0f);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double double11 = iIRFilter1.process((double) 10);
        double[] doubleArray16 = new double[] { 1.0d, 100.0f, 100.0d, (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 1);
        double double19 = iIRFilter1.process((double) (short) -1);
        double double21 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray29 = new double[] { 100, (byte) 10, (short) 10, 0.0f, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 10.0, 10.0, 0.0, 10.0, 52.0]");
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (-1L));
        double double19 = iIRFilter1.process((double) 0L);
        double[] doubleArray20 = null;
        double[] doubleArray26 = new double[] { (byte) 10, 0.0d, (byte) 100, 100.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 0.0, 100.0, 100.0, 0.0]");
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
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
        double double33 = iIRFilter1.process((double) '#');
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 0L);
        double[] doubleArray12 = null;
        double[] doubleArray19 = new double[] { (short) 100, (-1.0f), (short) 100, 10, (byte) 1, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, -1.0, 100.0, 10.0, 1.0, 32.0]");
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process(52.0d);
        double double15 = iIRFilter1.process((double) (byte) 0);
        double double17 = iIRFilter1.process((double) (-1L));
        double[] doubleArray24 = new double[] { (byte) 100, (-1L), (-1L), (short) 1, 0.0f, ' ' };
        double[] doubleArray27 = new double[] { 10, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, -1.0, -1.0, 1.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0]");
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
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
        double double33 = iIRFilter1.process((double) (short) 0);
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
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process(52.0d);
        double double21 = iIRFilter1.process((double) 100L);
        double double23 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) 'a');
        double double19 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray25 = new double[] { 35.0d, 100, 10L, (-1.0f), 0L };
        double[] doubleArray28 = new double[] { 0.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[35.0, 100.0, 10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray12 = new double[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0]");
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (-1));
        double double7 = iIRFilter1.process((double) ' ');
        double[] doubleArray10 = new double[] { (short) 0, 100 };
        double[] doubleArray13 = new double[] { (-1.0d), 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0]");
    }
}

