package IIRFilter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double[] doubleArray20 = new double[] { 100, 32.0d, (-1L), (-1), 100L, 10.0f };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 32.0, -1.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double[] doubleArray9 = new double[] { (byte) 10, 35.0d, 32.0d, (byte) 1, 10.0d };
        double[] doubleArray15 = new double[] { 0L, 100L, (short) -1, (byte) 10, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 35.0, 32.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, -1.0, 10.0, 1.0]");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        double double5 = iIRFilter1.process((double) 100);
        double double7 = iIRFilter1.process((double) 1L);
        double[] doubleArray10 = new double[] { 32.0d, 1L };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 10);
        double double17 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((-1.0d));
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double[] doubleArray4 = new double[] { (-1L), (-1) };
        double[] doubleArray10 = new double[] { 100, 'a', (-1), 100.0f, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 97.0, -1.0, 100.0, 52.0]");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double[] doubleArray19 = new double[] { 97.0d, 1.0f, (short) 0, 1, 10.0d };
        double[] doubleArray24 = new double[] { (byte) 1, (short) -1, 100.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray24);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 1.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0, 100.0, 100.0]");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray12 = null;
        double[] doubleArray17 = new double[] { (byte) 100, (short) 100, '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0, 35.0, 1.0]");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100L);
        double[] doubleArray17 = new double[] { (short) 100, (byte) -1, (byte) 10, (short) 0, (byte) 1 };
        double[] doubleArray20 = new double[] { 10L, (-1L) };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, -1.0, 10.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0]");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray10 = new double[] { (byte) 0, (short) 10, (-1L), (byte) 0, 100.0d, 0 };
        double[] doubleArray15 = new double[] { 97.0d, (byte) -1, (-1L), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 10.0, -1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, -1.0, -1.0, -1.0]");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray9 = new double[] { 10L, 97.0d, '4', 0, 97.0d };
        double[] doubleArray14 = new double[] { 0, 35.0d, (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 97.0, 52.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 35.0, -1.0, 1.0]");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray18 = new double[] { (-1.0d), (byte) 100, 10.0d, 52.0d, 100.0f, (-1.0d) };
        double[] doubleArray22 = new double[] { 97.0d, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 10.0, 52.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, -1.0, 0.0]");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray23 = new double[] { 100L, 35.0d, 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 35.0, 10.0, 10.0]");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double[] doubleArray14 = new double[] { 1, (byte) 100 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray7 = new double[] { 1.0d, 35.0d, 0 };
        double[] doubleArray11 = new double[] { 100L, (-1), 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, 100.0]");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double[] doubleArray9 = new double[] { 1L };
        double[] doubleArray12 = new double[] { 'a', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 0.0]");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double[] doubleArray9 = new double[] { 52.0d };
        double[] doubleArray16 = new double[] { (-1.0d), 0.0f, 0L, 10L, (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0, 0.0, 10.0, -1.0, 35.0]");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0f), (byte) 100, '4', (-1L) };
        double[] doubleArray16 = new double[] { 0L, (short) 100, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0, 100.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, -1.0]");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100L);
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { (-1.0f), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0]");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray9 = new double[] { (-1L) };
        double[] doubleArray16 = new double[] { 0L, 100.0f, 100, (-1), (byte) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 100.0, -1.0, 10.0, 35.0]");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double[] doubleArray10 = new double[] { (-1), 32.0d, (short) 0, (short) 10, 100L, 100L };
        double[] doubleArray17 = new double[] { 100L, (-1), 10L, (byte) -1, (byte) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 32.0, 0.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, -1.0, 10.0, -1.0, 10.0, 1.0]");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double[] doubleArray10 = new double[] {};
        double[] doubleArray14 = new double[] { 10L, 35.0d, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 35.0, 35.0]");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        double double21 = iIRFilter1.process(35.0d);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray11 = new double[] { 1L, 52.0d, 10.0f, 32.0d, 100.0f };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 52.0, 10.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { 0L, '4', 97.0d, 100.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 52.0, 97.0, 100.0, 35.0]");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray9 = new double[] { 52.0d, (short) 0, 100.0f };
        double[] doubleArray14 = new double[] { 97.0d, (byte) 10, (-1), (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 10.0, -1.0, -1.0]");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray19 = new double[] { 0.0f, 1.0f, (short) 0, 52.0d, 0 };
        double[] doubleArray23 = new double[] { (-1.0d), 35.0d, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 0.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 35.0, 32.0]");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 10);
        double double17 = iIRFilter1.process(97.0d);
        double[] doubleArray24 = new double[] { (byte) 1, (byte) -1, (short) -1, 0.0f, 35.0d, 0.0f };
        double[] doubleArray29 = new double[] { (-1), 35.0d, 0L, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0, -1.0, 0.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 35.0, 0.0, 100.0]");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray14 = new double[] { (short) 10, 10, (byte) 100, (byte) 100, 10, 100L };
        double[] doubleArray19 = new double[] { 32.0d, (short) 0, (-1.0f), (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 100.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 0.0, -1.0, -1.0]");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray21 = new double[] { '4', 10L, 1, (short) 10, 35.0d };
        double[] doubleArray25 = new double[] { 'a', 52.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 10.0, 1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0, 52.0, -1.0]");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray11 = new double[] { 52.0d };
        double[] doubleArray13 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { '4', 100, (byte) 0, 100L, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 100.0, 0.0, 100.0, 0.0]");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray18 = new double[] { (-1.0f), 0.0f, (short) 100, '#' };
        double[] doubleArray25 = new double[] { 32.0d, (-1L), (byte) 100, 10, 52.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, -1.0, 100.0, 10.0, 52.0, 100.0]");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double[] doubleArray6 = new double[] { (short) -1, 1.0f };
        double[] doubleArray13 = new double[] { 10.0f, 1.0d, (short) -1, (byte) 0, 100.0f, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, -1.0, 0.0, 100.0, 0.0]");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (byte) 0);
        double double5 = iIRFilter1.process(35.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { 52.0d, 100.0f, 100.0d, (byte) -1 };
        double[] doubleArray20 = new double[] { (byte) 10, 97.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 97.0, 35.0]");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { 1.0d, '4', 100, 1L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 52.0, 100.0, 1.0, 0.0]");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10);
        double double5 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process(97.0d);
        double[] doubleArray12 = new double[] { 10, 1.0d, (short) 1, 1.0f, 0.0d, 1L };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 1.0, 1.0, 1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray8 = new double[] { 32.0d, 32.0d };
        double[] doubleArray11 = new double[] { (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray11 = new double[] { (-1) };
        double[] doubleArray18 = new double[] { 'a', (-1.0d), 1L, (byte) -1, 0.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, -1.0, 1.0, -1.0, 0.0, 10.0]");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray12 = null;
        double[] doubleArray16 = new double[] { 100, 100.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0, 100.0]");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(1.0d);
        double[] doubleArray7 = new double[] { (short) -1 };
        double[] doubleArray14 = new double[] { (short) 100, (short) 1, 1.0f, 97.0d, 'a', 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, 1.0, 97.0, 97.0, 35.0]");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray10 = new double[] { ' ', (-1.0f), '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, -1.0, 52.0]");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double[] doubleArray15 = new double[] { (-1), (short) 1, 10.0f };
        double[] doubleArray22 = new double[] { (short) 10, 0, 97.0d, (byte) 10, 10.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 0.0, 97.0, 10.0, 10.0, 100.0]");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double[] doubleArray2 = new double[] {};
        double[] doubleArray7 = new double[] { 52.0d, (short) 10, 0L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray2, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[52.0, 10.0, 0.0, -1.0]");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double[] doubleArray8 = new double[] { 1.0d, 1.0f, 'a', (-1.0d), (short) -1, 0.0d };
        double[] doubleArray15 = new double[] { 0.0f, 10.0f, (short) 0, (short) 0, (-1L), 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 1.0, 97.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0, 0.0, 0.0, -1.0, 0.0]");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray14 = new double[] { 1, (short) 0, (-1L), '4', (byte) 10, 0 };
        double[] doubleArray20 = new double[] { 'a', 52.0d, (short) -1, 10, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, -1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 52.0, -1.0, 10.0, 100.0]");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(10.0d);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray13 = new double[] { 35.0d, (short) -1, 52.0d, (byte) 0, 0.0f, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, -1.0, 52.0, 0.0, 0.0, 35.0]");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray13 = new double[] { (short) 1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
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
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, -1.0]");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray10 = new double[] { 1.0f, 32.0d, (-1.0d), (byte) 1 };
        double[] doubleArray14 = new double[] { 10, 0.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 32.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 100.0]");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        double[] doubleArray25 = new double[] { 10L, 1L, 10.0f, (byte) 1, ' ' };
        double[] doubleArray29 = new double[] { 10.0d, 0.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 1.0, 10.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 0.0, -1.0]");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        double double7 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray12 = new double[] { (byte) 100, 'a', (byte) 0, 10L };
        double[] doubleArray14 = new double[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 10);
        double[] doubleArray4 = new double[] { 10.0f, 10 };
        double[] doubleArray8 = new double[] { (byte) -1, '#', (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 35.0, -1.0]");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 10L);
        double[] doubleArray12 = null;
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double[] doubleArray13 = new double[] { ' ', 10, 1L, 0, 32.0d };
        double[] doubleArray19 = new double[] { 100.0d, (byte) 1, 1.0d, 100.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 1.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, 1.0, 100.0, 0.0]");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray19 = new double[] { 1, 'a', (byte) 100 };
        double[] doubleArray23 = new double[] { 52.0d, 35.0d, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, 35.0, 10.0]");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double[] doubleArray7 = new double[] { 32.0d, (byte) 0, (-1.0d), (-1L), (byte) 10 };
        double[] doubleArray11 = new double[] { 10L, (byte) 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[32.0, 0.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 10.0]");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        double[] doubleArray22 = new double[] { 0, (short) 0 };
        double[] doubleArray28 = new double[] { 0.0d, '4', '#', 100, 100L };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 52.0, 35.0, 100.0, 100.0]");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray8 = new double[] { (short) 1, 52.0d, (-1.0f), 'a' };
        double[] doubleArray11 = new double[] { 52.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 52.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, -1.0]");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray21 = new double[] { (byte) 10, 1.0d, 0.0f, (-1), '#' };
        double[] doubleArray22 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray22);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 1.0, 0.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double[] doubleArray14 = new double[] { (short) 100, (byte) 100, (-1), (byte) 10, 0.0d, (short) 100 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, -1.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) 10);
        double[] doubleArray9 = new double[] { (byte) -1, 10.0d, 10, (short) 10, (-1) };
        double[] doubleArray11 = new double[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0]");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double[] doubleArray13 = new double[] { 0.0d, 0, 32.0d };
        double[] doubleArray17 = new double[] { 0.0d, (byte) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, -1.0, 0.0]");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double[] doubleArray8 = new double[] { 0L, 100.0d, '4', 1.0d };
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 1L);
        double[] doubleArray11 = new double[] { (-1), 32.0d, (short) 10 };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        double double5 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double[] doubleArray13 = new double[] { '4' };
        double[] doubleArray17 = new double[] { 100, 10L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, -1.0]");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray13 = new double[] { (-1.0f), 10L, 35.0d, ' ', 10.0d, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 35.0, 32.0, 10.0, 52.0]");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process(0.0d);
        double[] doubleArray8 = new double[] { (short) 10, (short) -1 };
        double[] doubleArray11 = new double[] { (-1.0d), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0]");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray20 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { (-1.0f), 32.0d, 1.0d, 97.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 32.0, 1.0, 97.0, 100.0]");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray20 = new double[] { 10.0f, (byte) 1, 10.0d, (byte) 100, 1, ' ' };
        double[] doubleArray27 = new double[] { (short) 100, (byte) 0, 100L, 10, 10L, '4' };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 1.0, 10.0, 100.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 0.0, 100.0, 10.0, 10.0, 52.0]");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) (short) 10);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process(35.0d);
        double[] doubleArray11 = new double[] { (byte) 0, 10.0d, 1.0f };
        double[] doubleArray17 = new double[] { (-1.0d), 10, (byte) 1, 0, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, 1.0, 0.0, 97.0]");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray19 = new double[] { (-1.0f), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 32.0]");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double[] doubleArray13 = new double[] { 10.0f, '#', 'a', 1L, (-1.0f) };
        double[] doubleArray18 = new double[] { 0, 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 35.0, 97.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 100.0, 10.0]");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(1.0d);
        double[] doubleArray8 = new double[] { (byte) 1, (byte) 0 };
        double[] doubleArray10 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0]");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double[] doubleArray7 = new double[] { (-1.0f) };
        double[] doubleArray14 = new double[] { 100L, (-1L), (byte) 1, (-1L), 1.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 1.0, -1.0, 1.0, -1.0]");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray10 = new double[] { 100, (byte) 1, 1.0f, (byte) 10, (-1.0f), 'a' };
        double[] doubleArray12 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0, 1.0, 10.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0]");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double[] doubleArray5 = new double[] { 0 };
        double[] doubleArray11 = new double[] { 97.0d, '#', 1, (short) 1, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray5, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 35.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray11 = new double[] { 97.0d, (byte) 10, 0.0d, 0, 'a' };
        double[] doubleArray13 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 10.0, 0.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double[] doubleArray16 = new double[] { (short) -1, ' ', 0, (short) -1 };
        double[] doubleArray18 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 32.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0]");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray18 = new double[] { 10L, 0.0f, ' ', 0L, 32.0d, (-1L) };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 100.0d, (-1L), 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 0.0, 32.0, 0.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 1.0, 100.0, -1.0, 52.0]");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray13 = new double[] { 10.0f, 10.0d, 0.0d };
        double[] doubleArray15 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray8 = null;
        double[] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double[] doubleArray17 = new double[] { 10 };
        double[] doubleArray19 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray19);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0]");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process(97.0d);
        double[] doubleArray18 = new double[] { 0, (short) 0, 1L, 32.0d };
        double[] doubleArray21 = new double[] { 35.0d, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 35.0]");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double[] doubleArray14 = new double[] { ' ', 0.0f, 1, (short) 10 };
        double[] doubleArray21 = new double[] { 10L, 'a', (-1.0d), 1, 0.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 97.0, -1.0, 1.0, 0.0, 100.0]");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double[] doubleArray16 = new double[] { 'a', 100L, 35.0d, 0 };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0, 35.0, 0.0]");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double[] doubleArray15 = new double[] { 'a', '#', 100.0f, 100, '4' };
        double[] doubleArray20 = new double[] { (-1.0d), (byte) 100, 97.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 35.0, 100.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 10.0]");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1));
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double[] doubleArray11 = new double[] { (byte) -1, 10.0d, 'a' };
        double[] doubleArray14 = new double[] { 35.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0]");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray13 = new double[] { 1, 0, (-1L), 0, (-1) };
        double[] doubleArray15 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0, -1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0]");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray10 = new double[] { 0, (byte) -1, 97.0d, 100L };
        double[] doubleArray16 = new double[] { 1L, 1L, 100.0f, 100.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, -1.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 100.0, 100.0, 10.0]");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        double[] doubleArray13 = new double[] { '4', 10L, (byte) 1 };
        double[] doubleArray15 = new double[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double[] doubleArray12 = null;
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 10);
        double[] doubleArray24 = new double[] { (short) 1, (short) 10, 10.0d, (short) 1, (short) 100, (byte) 0 };
        double[] doubleArray29 = new double[] { (byte) 1, 1L, (byte) 10, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 10.0, 10.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 1.0, 10.0, 1.0]");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray14 = null;
        double[] doubleArray20 = new double[] { (-1L), 0.0f, 'a', 10.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 97.0, 10.0, 1.0]");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        double double23 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (-1));
        double double13 = iIRFilter1.process((double) 0);
        double[] doubleArray20 = new double[] { 10L, (-1.0f), 1.0d, ' ', 0.0f, 1 };
        double[] doubleArray27 = new double[] { 'a', 0.0f, (short) 10, (byte) -1, 10.0d, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 1.0, 32.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, 0.0, 10.0, -1.0, 10.0, 52.0]");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray10 = null;
        double[] doubleArray16 = new double[] { 'a', 'a', 10, 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 97.0, 10.0, 100.0, 32.0]");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((-1.0d));
        double[] doubleArray18 = new double[] { (short) 10, 1L };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, (short) 1, (short) -1, (-1.0d), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 1.0, -1.0, -1.0, 1.0]");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray12 = new double[] { (byte) 0, 0.0d };
        double[] doubleArray18 = new double[] { (-1), 97.0d, 0.0f, 97.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 0.0, 97.0, 0.0]");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray19 = new double[] { 100, (short) 0, 0.0d, (byte) 10, 32.0d };
        double[] doubleArray26 = new double[] { 0.0d, (byte) 1, '#', ' ', (short) -1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray26);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 0.0, 0.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0, 35.0, 32.0, -1.0, 10.0]");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) ' ');
        double[] doubleArray14 = new double[] { (byte) 1, (byte) 0, (short) 10, ' ', 10L, (short) 100 };
        double[] doubleArray18 = new double[] { (byte) 1, 10.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, 10.0, 32.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, -1.0]");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double[] doubleArray17 = new double[] { 1L, (-1.0f), 100L };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double[] doubleArray12 = new double[] { 'a', 52.0d, 52.0d, 10L };
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 52.0, 52.0, 10.0]");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { ' ', (byte) 100, 52.0d, ' ' };
        double[] doubleArray19 = new double[] { 10.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 100.0, 52.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0]");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray16 = new double[] { 1.0f, 1, 32.0d, 10.0f, 0, 10.0f };
        double[] doubleArray19 = new double[] { 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 32.0, 10.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, -1.0]");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray11 = new double[] { ' ' };
        double[] doubleArray17 = new double[] { 1.0f, 100.0d, 10.0d, 'a', 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 10.0, 97.0, 100.0]");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double[] doubleArray13 = new double[] { 1L, 1L, 1.0f };
        double[] doubleArray16 = new double[] { '#', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 1.0]");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(100.0d);
        double[] doubleArray11 = new double[] { '4' };
        double[] doubleArray17 = new double[] { (short) 1, (byte) 100, (byte) 0, 32.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 0.0, 32.0, -1.0]");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process(0.0d);
        double[] doubleArray11 = new double[] { (-1.0f), (-1), (short) 10, (short) 100, (short) -1 };
        double[] doubleArray13 = new double[] { 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0]");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray10 = null;
        double[] doubleArray16 = new double[] { 52.0d, (byte) 100, 0.0d, 1.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 100.0, 0.0, 1.0, -1.0]");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray14 = new double[] { 100.0d, '4', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 52.0, 0.0]");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray10 = new double[] { 1, 1.0f, 1L, (-1) };
        double[] doubleArray14 = new double[] { 100.0f, (byte) 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, 0.0]");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray6 = new double[] { 100.0f, 0 };
        double[] doubleArray8 = new double[] { 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[32.0]");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray16 = new double[] { 0, 0, (short) 1, 10.0d, 100, 35.0d };
        double[] doubleArray18 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 1.0, 10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process(1.0d);
        double[] doubleArray21 = new double[] { 100.0f, 1.0d, (-1.0d), (byte) 1, 1L };
        double[] doubleArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, -1.0, 1.0, 1.0]");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray16 = new double[] { (-1L), 100.0d, 52.0d, 1.0d, 10.0f, (byte) -1 };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, 52.0, 1.0, 10.0, -1.0]");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process(97.0d);
        double[] doubleArray10 = new double[] { (-1.0d), 0.0f, 35.0d, (short) 1 };
        double[] doubleArray13 = new double[] { (-1L), 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0, 35.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0]");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray12 = new double[] { (byte) -1, 1L };
        double[] doubleArray16 = new double[] { 0L, 0, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 1.0]");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double[] doubleArray14 = new double[] { 0L, 32.0d };
        double[] doubleArray18 = new double[] { (short) 100, 32.0d, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 32.0, 10.0]");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process(1.0d);
        double[] doubleArray20 = new double[] { 97.0d, 35.0d, 52.0d, 10, (short) 0, 'a' };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 35.0, 52.0, 10.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double[] doubleArray6 = new double[] { 1L, 97.0d };
        double[] doubleArray9 = new double[] { 100, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0]");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        double[] doubleArray25 = new double[] { 100.0f, (short) 1, (byte) 100, 1, 100L };
        double[] doubleArray29 = new double[] { 52.0d, '4', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, 52.0, 10.0]");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray7 = new double[] { 1L };
        double[] doubleArray9 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray17 = new double[] { 10, (short) 0, 1.0d, '4', 0.0f };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double[] doubleArray19 = new double[] { 10L, 0L, 1L, 0, (-1.0d) };
        double[] doubleArray25 = new double[] { 1, 10.0f, 35.0d, 100.0d, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0, 1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0, 35.0, 100.0, 52.0]");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (-1));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(32.0d);
        double[] doubleArray9 = new double[] { 32.0d };
        double[] doubleArray15 = new double[] { 0, 10L, 0.0f, 1.0f, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0, 0.0, 1.0, 32.0]");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double[] doubleArray16 = new double[] { ' ', (-1), (-1L), 100.0f, (short) -1, (short) 1 };
        double[] doubleArray20 = new double[] { 0.0f, 1, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, -1.0, -1.0, 100.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0, 32.0]");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(100.0d);
        double[] doubleArray19 = new double[] { (short) 100, 100, '#' };
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 35.0]");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray18 = new double[] { 'a', 10.0d, (-1.0f), 0.0d, 100.0f, '#' };
        double[] doubleArray21 = new double[] { 97.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 10.0, -1.0, 0.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 0.0]");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(97.0d);
        double[] doubleArray12 = new double[] { 0.0f, 32.0d, (-1.0f), 0.0f, 10.0d, 100.0d };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 32.0, -1.0, 0.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray12 = null;
        double[] doubleArray15 = new double[] { (-1L), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0]");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray11 = new double[] { 0.0f, (byte) 0, 100.0d };
        double[] doubleArray16 = new double[] { (short) 0, 1, 10L, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0, 10.0, 35.0]");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double[] doubleArray14 = new double[] { 100.0f, (byte) -1, 1, 1.0d };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double[] doubleArray14 = new double[] { 1, 52.0d, 100, (byte) -1, (-1.0f), 0 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 52.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray18 = new double[] { (short) 100, 1.0f, 32.0d, 52.0d };
        double[] doubleArray20 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, 32.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0]");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray18 = new double[] { (byte) 0, (short) -1, (byte) -1, 0, 32.0d, (short) 0 };
        double[] doubleArray20 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, -1.0, -1.0, 0.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0]");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        double[] doubleArray27 = new double[] { (short) -1, (-1.0f), 0.0d };
        double[] doubleArray34 = new double[] { (short) 100, 0.0d, 35.0d, 0L, (-1L), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray34);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 0.0, 35.0, 0.0, -1.0, 32.0]");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (byte) 0);
        double double5 = iIRFilter1.process((double) (-1));
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) 1);
        double[] doubleArray16 = new double[] { 0.0d, 10.0d };
        double[] doubleArray23 = new double[] { 100.0d, (-1.0d), (short) -1, 'a', ' ', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, -1.0, -1.0, 97.0, 32.0, 0.0]");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) ' ');
        double[] doubleArray22 = new double[] { 1.0f, '4', (-1.0f), 10.0d, '#', 0L };
        double[] doubleArray24 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray24);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 52.0, -1.0, 10.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0]");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { 0L, (short) 0, 32.0d, (byte) 1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 32.0, 1.0, 0.0]");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process(1.0d);
        double[] doubleArray15 = new double[] { 100 };
        double[] doubleArray21 = new double[] { 97.0d, 32.0d, (byte) 10, (byte) 10, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 32.0, 10.0, 10.0, 97.0]");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray22 = new double[] { 35.0d, 'a', '#' };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 97.0, 35.0]");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray20 = new double[] { 0.0f, 10 };
        double[] doubleArray22 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray22);
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0]");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((-1.0d));
        double[] doubleArray8 = null;
        double[] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double[] doubleArray16 = new double[] { (short) -1, 97.0d, 10L, 97.0d };
        double[] doubleArray20 = new double[] { (short) 10, '4', '4' };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 97.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 52.0]");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        double double23 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray16 = new double[] { 1, 0.0f, 32.0d, ' ', 10.0f, 0.0f };
        double[] doubleArray23 = new double[] { (byte) 1, 'a', (byte) -1, ' ', 35.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0, 32.0, 32.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 97.0, -1.0, 32.0, 35.0, -1.0]");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray14 = new double[] { 0, (byte) 1 };
        double[] doubleArray21 = new double[] { 1.0d, (short) 100, 0.0f, 100.0d, 1, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 0.0, 100.0, 1.0, 1.0]");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray7 = new double[] { (short) 1, (short) 10, (byte) 0 };
        double[] doubleArray9 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1));
        double[] doubleArray13 = new double[] { (short) 0, 10.0f, (byte) 10 };
        double[] doubleArray18 = new double[] { (byte) 100, (byte) -1, 100.0f, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, -1.0, 100.0, -1.0]");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray7 = new double[] { 1L };
        double[] doubleArray14 = new double[] { (byte) 0, 10.0f, (-1L), 100L, 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bCoeffs must be of size 1, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 10.0, -1.0, 100.0, 10.0, -1.0]");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double[] doubleArray12 = new double[] { 10.0d, (-1), 10.0f, (short) 100, 10L, 100.0d };
        double[] doubleArray15 = new double[] { 10.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, 10.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0]");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray13 = new double[] { 0L, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray20 = new double[] { '4', (byte) -1, (-1), 0.0d, (byte) 10, 0L };
        double[] doubleArray22 = new double[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray22);
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, -1.0, -1.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { 100.0d, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, -1.0]");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray19 = new double[] { (short) 100, (short) 100, (byte) 10, 0L, 97.0d };
        double[] doubleArray20 = new double[] {};
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 10.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray8 = new double[] { (-1L), 100L };
        double[] doubleArray10 = new double[] { 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0]");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray16 = new double[] { (byte) 10, 1L, 0L, 10L };
        double[] doubleArray21 = new double[] { 10, 100.0f, ' ', (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0, 32.0, -1.0]");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        double[] doubleArray8 = new double[] { (byte) 10, (-1.0f) };
        double[] doubleArray12 = new double[] { (byte) 100, 1.0f, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, 0.0]");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        double[] doubleArray26 = new double[] { 10, (byte) 0, 35.0d, 1.0f, (byte) 100, 1 };
        double[] doubleArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray27);
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
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 0.0, 35.0, 1.0, 100.0, 1.0]");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double[] doubleArray15 = new double[] { '#', (byte) 100, (byte) 0 };
        double[] doubleArray17 = new double[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double[] doubleArray11 = new double[] { 10.0f, (short) -1, 0L };
        double[] doubleArray14 = new double[] { (byte) -1, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 32.0]");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1L);
        double[] doubleArray9 = new double[] { 10.0d, (short) 1, 100.0d };
        double[] doubleArray16 = new double[] { (short) 0, 32.0d, (byte) -1, 100.0d, 0.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 32.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray17 = new double[] { (-1.0d), (byte) 10, (short) 0 };
        double[] doubleArray23 = new double[] { (-1.0d), (byte) 100, 35.0d, 97.0d, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 35.0, 97.0, 52.0]");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray10 = new double[] { 97.0d, 100L, (short) 100, (byte) 1, (byte) -1, 52.0d };
        double[] doubleArray13 = new double[] { 100.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 100.0, 100.0, 1.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0]");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray16 = new double[] { 100.0d, 10.0f, 10.0f, (short) 1, 'a', 100 };
        double[] doubleArray20 = new double[] { '4', 35.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0, 10.0, 1.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 35.0, 100.0]");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double[] doubleArray9 = new double[] { (-1.0f), 32.0d, 1 };
        double[] doubleArray13 = new double[] { (-1.0f), 0.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 100.0]");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray13 = new double[] { '#', (byte) -1, 10L };
        double[] doubleArray16 = new double[] { 10L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 0.0]");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(32.0d);
        double[] doubleArray16 = new double[] { 0.0d, 32.0d, (short) 100, 100L, 10.0d, 0.0f };
        double[] doubleArray21 = new double[] { (short) -1, (short) -1, 10L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 32.0, 100.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double[] doubleArray11 = new double[] { 1L, 1, (short) 10, (-1.0d), 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L, 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0, 0.0, -1.0]");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray17 = new double[] { 1.0f, (byte) 1, 100L, 10.0d, 10L };
        double[] doubleArray24 = new double[] { 52.0d, (-1), ' ', 100.0d, '#', (byte) 0 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 1.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[52.0, -1.0, 32.0, 100.0, 35.0, 0.0]");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray9 = new double[] { 'a', (-1L), (byte) -1 };
        double[] doubleArray14 = new double[] { 10L, 1.0d, (-1L), 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 1.0, -1.0, 1.0]");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 1L);
        double[] doubleArray13 = new double[] { 1.0d, ' ', (short) 10, 1.0d, 1 };
        double[] doubleArray16 = new double[] { (short) 0, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 32.0, 10.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, -1.0]");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100L);
        double double13 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray15 = new double[] { '#' };
        double[] doubleArray19 = new double[] { (-1.0d), 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 0.0]");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray17 = new double[] { (byte) 0, 0.0f, 100.0f };
        double[] doubleArray24 = new double[] { 32.0d, 0, 32.0d, (-1.0f), (short) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[32.0, 0.0, 32.0, -1.0, 100.0, 35.0]");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double[] doubleArray17 = new double[] { 35.0d, (short) 100, 0.0f };
        double[] doubleArray22 = new double[] { (short) 0, (short) 1, (-1L), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0, -1.0, 10.0]");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray7 = new double[] { '4' };
        double[] doubleArray10 = new double[] { 32.0d, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 35.0]");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double[] doubleArray14 = new double[] { 100.0f, 1, 100, (-1.0f), 52.0d, (byte) 100 };
        double[] doubleArray21 = new double[] { (short) 100, (byte) 1, 1.0d, 0L, (byte) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, 100.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, 1.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray14 = null;
        double[] doubleArray19 = new double[] { 10.0d, (-1L), 'a', (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, 97.0, -1.0]");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double[] doubleArray15 = new double[] { (-1) };
        double[] doubleArray21 = new double[] { 0, (-1.0d), 0, (short) 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0, 0.0, 1.0, 1.0]");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray16 = new double[] { '4', (short) 0, (-1.0d), 10 };
        double[] doubleArray18 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double[] doubleArray13 = new double[] { 97.0d, 0.0f, (short) 0 };
        double[] doubleArray16 = new double[] { 100.0f, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0]");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double[] doubleArray10 = new double[] {};
        double[] doubleArray16 = new double[] { 0L, 32.0d, 97.0d, 0L, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 32.0, 97.0, 0.0, 0.0]");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray9 = new double[] { 10, ' ', (short) 0, 97.0d, (byte) 1 };
        double[] doubleArray13 = new double[] { 0L, (byte) 100, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 32.0, 0.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 100.0, 10.0]");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(100.0d);
        double[] doubleArray17 = new double[] { (short) 10, 100.0d, 97.0d };
        double[] doubleArray19 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray19 = new double[] { (byte) 10 };
        double[] doubleArray25 = new double[] { (short) 100, 'a', (short) 0, 1.0f, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 97.0, 0.0, 1.0, 32.0]");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { (-1.0d), 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 10.0]");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray10 = new double[] { (short) 1, (short) -1, 'a', 1.0d };
        double[] doubleArray12 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray14 = new double[] { 1L, 97.0d, (short) 10, 10.0d };
        double[] doubleArray19 = new double[] { (-1.0f), '#', (byte) 100, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 97.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 35.0, 100.0, -1.0]");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double[] doubleArray14 = new double[] { (short) 1, '4', 52.0d, 100, (-1.0f), 100L };
        double[] doubleArray18 = new double[] { 1L, 10.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 52.0, 52.0, 100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 100.0]");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1L);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray13 = new double[] { (short) -1, 100.0d, 0L, 10.0d, '4', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0, 0.0, 10.0, 52.0, -1.0]");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) '4');
        double[] doubleArray21 = new double[] { 1L, 10.0d, (-1.0d), (short) 100, '4' };
        double[] doubleArray26 = new double[] { 10L, (-1.0f), 100.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, -1.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, -1.0, 100.0, -1.0]");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process(1.0d);
        double[] doubleArray11 = new double[] { '#' };
        double[] doubleArray14 = new double[] { 10.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, -1.0]");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(32.0d);
        double[] doubleArray14 = new double[] { 35.0d, (byte) 1, 0.0d, 100 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double[] doubleArray12 = new double[] { 32.0d, 1.0d, 10, (short) 100 };
        double[] doubleArray19 = new double[] { 0.0d, (byte) 100, 0, 10, (short) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 100.0, 0.0, 10.0, 100.0, 100.0]");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (-1));
        double[] doubleArray12 = new double[] { (-1.0d), (short) -1, 35.0d, (-1), 10L, 10.0d };
        double[] doubleArray14 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 35.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray19 = new double[] { '#', (short) 10, (short) 0 };
        double[] doubleArray25 = new double[] { (byte) 1, 10, 1.0f, (short) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0, 1.0, -1.0, 97.0]");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process(35.0d);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double[] doubleArray4 = new double[] { (-1L), (-1.0f) };
        double[] doubleArray8 = new double[] { 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0, 100.0]");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray14 = new double[] { 10L, (short) 0, '4', 100.0d, 35.0d, 97.0d };
        double[] doubleArray16 = new double[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 52.0, 100.0, 35.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray11 = new double[] { 52.0d, 35.0d, 0.0d };
        double[] doubleArray17 = new double[] { (byte) 0, 10.0f, (byte) -1, (-1), (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 10.0, -1.0, -1.0, -1.0]");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray17 = new double[] { 97.0d, (byte) 10, (byte) 100, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 10.0, 100.0, 100.0]");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray9 = new double[] { (short) -1, 10.0f, ' ' };
        double[] doubleArray12 = new double[] { (byte) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0]");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) (-1L));
        double[] doubleArray14 = new double[] { 1.0d, (byte) 0, 0.0f, 0 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray14 = new double[] { (-1), 100, (-1L), (byte) 1, (short) 10, 0.0f };
        double[] doubleArray17 = new double[] { 0L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, -1.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0]");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(97.0d);
        double[] doubleArray22 = new double[] { (-1), 52.0d, (short) 10, (short) 0, 0.0d, (short) 1 };
        double[] doubleArray25 = new double[] { 100, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 52.0, 10.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0]");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double[] doubleArray14 = new double[] { '#', 97.0d };
        double[] doubleArray21 = new double[] { (byte) 1, 100.0f, (short) 100, 10L, 1.0d, 0.0d };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 100.0, 10.0, 1.0, 0.0]");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double[] doubleArray12 = new double[] { 0L, (short) 1 };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 'a');
        double[] doubleArray10 = new double[] { 10L, (short) -1 };
        double[] doubleArray16 = new double[] { (short) -1, 100L, 100, '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, 100.0, 35.0, 0.0]");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        double[] doubleArray11 = new double[] { (short) 0 };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray22 = new double[] { 0L, (-1), 35.0d, (short) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, -1.0, 35.0, 100.0, -1.0]");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray12 = new double[] { '#', (short) -1, '4', (byte) 10, (-1.0d), 0L };
        double[] doubleArray17 = new double[] { (short) 10, 10L, (-1L), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, -1.0, 52.0, 10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) '#');
        double double19 = iIRFilter1.process((double) (-1L));
        double[] doubleArray24 = new double[] { (byte) 1, 10, 0, 0L };
        double[] doubleArray25 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray25);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double[] doubleArray14 = new double[] { 10.0f, (-1.0f), 100, 10.0f };
        double[] doubleArray18 = new double[] { (-1.0f), 100L, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 100.0]");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray16 = new double[] { '#', (short) 100 };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 100.0]");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double[] doubleArray6 = null;
        double[] doubleArray13 = new double[] { 100L, ' ', 32.0d, (short) 100, 52.0d, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 32.0, 32.0, 100.0, 52.0, 1.0]");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process(1.0d);
        double double15 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray22 = new double[] { (-1.0d), 100 };
        double[] doubleArray26 = new double[] { 1, 1L, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, 97.0]");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray12 = new double[] { (byte) -1, (-1), (short) -1, 1.0f };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process(1.0d);
        double double15 = iIRFilter1.process(97.0d);
        double[] doubleArray17 = new double[] { (short) -1 };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) '#');
        double[] doubleArray12 = new double[] { (short) 0, 100.0f, ' ', 52.0d };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 32.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) 100L);
        double[] doubleArray21 = new double[] { 35.0d, (short) 10, 'a', (byte) 0, (byte) 10 };
        double[] doubleArray24 = new double[] { 'a', 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray24);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 10.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 1.0]");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray18 = new double[] { 100.0f, 97.0d };
        double[] doubleArray22 = new double[] { 10.0f, '4', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, -1.0]");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray22 = new double[] { (-1), (byte) 100, 0, 1.0f, 0.0d, (short) 10 };
        double[] doubleArray26 = new double[] { 100, 97.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 0.0, 1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 97.0, 1.0]");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 10L);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray17 = new double[] { 52.0d, 100, 35.0d, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, 100.0, 35.0, 1.0]");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process(10.0d);
        double[] doubleArray13 = new double[] { 100L };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) '#');
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double[] doubleArray4 = new double[] { 97.0d, (short) -1 };
        double[] doubleArray5 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((-1.0d));
        double[] doubleArray14 = null;
        double[] doubleArray16 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray14 = new double[] { 'a', (short) 1 };
        double[] doubleArray21 = new double[] { 10.0f, 'a', 100.0d, 'a', (short) -1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 97.0, 100.0, 97.0, -1.0, 1.0]");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray19 = new double[] { (byte) 100, (short) 100, 10.0f, (short) -1, 'a' };
        double[] doubleArray21 = new double[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 10.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double[] doubleArray17 = new double[] { 100.0f, (-1L), 100L, 52.0d, (-1) };
        double[] doubleArray22 = new double[] { 100.0f, (byte) -1, 0.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, -1.0, 100.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, -1.0, 0.0, -1.0]");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 1L);
        double[] doubleArray18 = new double[] { 100.0d, (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 0, 1.0f, 100L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 100.0, 0.0]");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray12 = new double[] { ' ', (-1L) };
        double[] doubleArray14 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray18 = new double[] { ' ', (short) -1, 1, '#', (short) 1, 1 };
        double[] doubleArray24 = new double[] { 100, 0L, '#', 1.0f, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, -1.0, 1.0, 35.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 0.0, 35.0, 1.0, 32.0]");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double[] doubleArray6 = null;
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) ' ');
        double double13 = iIRFilter1.process((double) (-1));
        double[] doubleArray15 = new double[] { 1.0f };
        double[] doubleArray17 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray12 = null;
        double[] doubleArray15 = new double[] { (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0]");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray10 = new double[] { 100, '#', 10.0d, 0L };
        double[] doubleArray15 = new double[] { (-1L), 1, 0.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 35.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 1.0, 0.0, 1.0]");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double[] doubleArray16 = new double[] { (-1.0f), ' ' };
        double[] doubleArray23 = new double[] { (-1.0d), 100L, 100.0f, (-1.0f), 0.0f, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 100.0, -1.0, 0.0, 52.0]");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0]");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray16 = new double[] { 0.0d, 97.0d, (short) 10, (byte) 10 };
        double[] doubleArray23 = new double[] { (short) -1, 10.0f, 0L, (short) -1, (short) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 97.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, 0.0, -1.0, 1.0, 1.0]");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray19 = new double[] { 1.0f, 100.0f, (short) -1 };
        double[] doubleArray22 = new double[] { (short) -1, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray22);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 32.0]");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double[] doubleArray19 = new double[] { 1, 100L, (byte) 100, (byte) 100, (byte) 10 };
        double[] doubleArray25 = new double[] { 52.0d, 100.0d, 35.0d, '4', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 100.0, 35.0, 52.0, 10.0]");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray18 = new double[] { 10.0f, (short) 10, '#', '4', 100, ' ' };
        double[] doubleArray22 = new double[] { 10.0f, (-1L), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 35.0, 52.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0, 10.0]");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray11 = new double[] { (byte) 0 };
        double[] doubleArray15 = new double[] { 10, 1.0f, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 1.0, 32.0]");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray19 = new double[] { 100 };
        double[] doubleArray24 = new double[] { (byte) 1, 100, 32.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, 32.0, 0.0]");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double[] doubleArray7 = new double[] { 10.0f };
        double[] doubleArray9 = new double[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) 0);
        double double15 = iIRFilter1.process((-1.0d));
        double[] doubleArray18 = new double[] { 1, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 0.0]");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) ' ');
        double[] doubleArray8 = null;
        double[] doubleArray10 = new double[] { 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0]");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (byte) 0);
        double double5 = iIRFilter1.process(35.0d);
        double[] doubleArray8 = new double[] { 0.0f, 100.0f };
        double[] doubleArray13 = new double[] { ' ', (-1.0d), 35.0d, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, -1.0, 35.0, 10.0]");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray17 = new double[] { 0L, (-1.0d), (short) 0, (-1.0d) };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, -1.0, 0.0, -1.0]");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) 100L);
        double[] doubleArray19 = new double[] { '4', 35.0d, 0.0f };
        double[] doubleArray25 = new double[] { (byte) -1, 0.0f, (short) 1, 100.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 1.0, 100.0, 100.0]");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double[] doubleArray12 = new double[] { 35.0d, 100L, (-1.0d), 0.0d };
        double[] doubleArray19 = new double[] { 52.0d, 97.0d, 10.0f, (byte) 100, 1.0d, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 97.0, 10.0, 100.0, 1.0, 52.0]");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 0L);
        double[] doubleArray13 = new double[] { (short) 100 };
        double[] doubleArray20 = new double[] { 10.0f, '4', (-1.0f), (-1.0f), 10, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, -1.0, -1.0, 10.0, 100.0]");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double[] doubleArray2 = null;
        double[] doubleArray3 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray2, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray7 = new double[] { (byte) -1 };
        double[] doubleArray9 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double[] doubleArray18 = new double[] { (short) 10, (-1.0f), 32.0d, 0.0f };
        double[] doubleArray22 = new double[] { ' ', 10.0f, 52.0d };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 10.0, 52.0]");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = iIRFilter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray17 = new double[] { 1.0d, (-1L), (short) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 0.0, 35.0]");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(1.0d);
        double[] doubleArray10 = null;
        double[] doubleArray13 = new double[] { 1L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0]");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double[] doubleArray15 = new double[] { 0.0d };
        double[] doubleArray18 = new double[] { 52.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray18);
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, -1.0]");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (-1L));
        double[] doubleArray14 = new double[] { (byte) 100, 10.0d };
        double[] doubleArray18 = new double[] { 1, 10, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 0.0]");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double[] doubleArray9 = new double[] { 32.0d };
        double[] doubleArray16 = new double[] { (short) 0, 1, (byte) 1, '#', 100.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0, 1.0, 35.0, 100.0, 10.0]");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(10.0d);
        double[] doubleArray19 = new double[] { 10L, 1.0f, 97.0d };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double[] doubleArray10 = new double[] { 1L, 1.0d };
        double[] doubleArray14 = new double[] { (byte) 10, (short) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, -1.0, 100.0]");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(1.0d);
        double[] doubleArray17 = new double[] { (byte) 1 };
        double[] doubleArray21 = new double[] { (-1L), ' ', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 32.0, 100.0]");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray7 = new double[] { 0.0d, 100L, 1 };
        double[] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 100.0, 1.0]");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray17 = new double[] { (byte) -1, (byte) 10, (-1L) };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        double double23 = iIRFilter1.process((double) 0L);
        double[] doubleArray27 = new double[] { 32.0d, 35.0d, 1 };
        double[] doubleArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray28);
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
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[32.0, 35.0, 1.0]");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process(10.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100L);
        double[] doubleArray15 = new double[] { 100L, (byte) 1, 52.0d };
        double[] doubleArray18 = new double[] { 32.0d, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 1.0]");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray23 = new double[] { 97.0d, 100.0d, 100.0f, 0, 100.0f };
        double[] doubleArray29 = new double[] { (-1L), 97.0d, 1L, (-1.0f), 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 100.0, 100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 97.0, 1.0, -1.0, 10.0]");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray15 = new double[] { (byte) 0, 'a', 35.0d };
        double[] doubleArray19 = new double[] { (-1.0d), 1.0f, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 97.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0, 52.0]");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((-1.0d));
        double[] doubleArray12 = new double[] { '#', 100, 100, 32.0d };
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 100.0, 100.0, 32.0]");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double[] doubleArray14 = new double[] { 52.0d, '4' };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double[] doubleArray7 = new double[] { '4', 0L, 0.0f };
        double[] doubleArray14 = new double[] { 100.0d, 97.0d, (byte) 100, 10L, (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[52.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 97.0, 100.0, 10.0, 0.0, 100.0]");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double[] doubleArray15 = new double[] { (short) -1, 0.0d, 52.0d };
        double[] doubleArray19 = new double[] { (short) -1, 100.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 10.0]");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (-1));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray10 = new double[] { 97.0d, (short) 10 };
        double[] doubleArray12 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        double[] doubleArray36 = new double[] { (-1.0f), '#', (byte) 10, (short) 10, 1L, 35.0d };
        double[] doubleArray40 = new double[] { (-1.0d), (short) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray36, doubleArray40);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 35.0, 10.0, 10.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 1.0]");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray10 = new double[] { (-1L), 0L };
        double[] doubleArray12 = new double[] { 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0]");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (-1L));
        double[] doubleArray24 = new double[] { 10, 10, 1L, 100L, 10, (-1L) };
        double[] doubleArray29 = new double[] { (byte) 10, 10.0f, 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 1.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 10.0, 1.0, 52.0]");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 10);
        double[] doubleArray14 = new double[] { 10, (short) 100, 1L, (short) -1, 97.0d, 1L };
        double[] doubleArray18 = new double[] { (-1.0f), (byte) 1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0, 1.0, -1.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0, -1.0]");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 'a');
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray18 = new double[] { (byte) 0, 97.0d, 1.0f, 10.0d, 0.0f, '#' };
        double[] doubleArray22 = new double[] { 100, 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 97.0, 1.0, 10.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, 1.0]");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray15 = new double[] { (short) 1, 32.0d, 100.0f };
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray10 = new double[] { (byte) 100, (-1) };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray20 = new double[] { 100.0d, '#', (byte) 1, ' ' };
        double[] doubleArray27 = new double[] { 100.0d, (byte) 0, (-1), 'a', (byte) 0, (-1.0d) };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 35.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 0.0, -1.0, 97.0, 0.0, -1.0]");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray10 = new double[] { (-1.0f), 1.0f };
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0]");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        double[] doubleArray24 = new double[] { 10L, 0L, 97.0d, (short) 1 };
        double[] doubleArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 0.0, 97.0, 1.0]");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) 10);
        double[] doubleArray7 = new double[] { (short) 1, 100, (byte) -1 };
        double[] doubleArray11 = new double[] { 0, 10L, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0, 10.0]");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { (-1L), 100.0d, 1L };
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 1.0]");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray14 = new double[] { (short) -1, '4', (byte) 10, '4', (byte) 1, ' ' };
        double[] doubleArray17 = new double[] { (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 52.0, 10.0, 52.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0]");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1));
        double[] doubleArray10 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) 100, '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 52.0, 35.0]");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray19 = new double[] { 10L, 97.0d, (-1) };
        double[] doubleArray26 = new double[] { 0, 0L, (short) 0, (byte) -1, (-1L), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 0.0, 0.0, -1.0, -1.0, 100.0]");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray14 = new double[] { (short) 0, '4', 100.0f, 10L, (byte) 1, (-1) };
        double[] doubleArray18 = new double[] { 'a', 100.0f, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 52.0, 100.0, 10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 100.0, 100.0]");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double[] doubleArray18 = new double[] { ' ', 10.0f, ' ', (byte) -1, 1, 100.0f };
        double[] doubleArray22 = new double[] { 0.0d, 52.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 10.0, 32.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 52.0, -1.0]");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process(35.0d);
        double[] doubleArray10 = null;
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process(35.0d);
        double[] doubleArray12 = new double[] { 32.0d, 10, 35.0d, 0.0d };
        double[] doubleArray18 = new double[] { 97.0d, (short) 100, 0.0d, 0, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 10.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 100.0, 0.0, 0.0, -1.0]");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10L);
        double double7 = iIRFilter1.process(0.0d);
        double[] doubleArray9 = new double[] { (short) 100 };
        double[] doubleArray13 = new double[] { 0.0d, 10, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, 100.0]");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process((double) '#');
        double[] doubleArray12 = new double[] { (-1), (-1.0f) };
        double[] doubleArray19 = new double[] { 1, (byte) 0, (short) 0, 10.0f, (short) 0, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 0.0, 0.0, 10.0, 0.0, -1.0]");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double[] doubleArray14 = null;
        double[] doubleArray20 = new double[] { 0L, 0.0f, 97.0d, 0L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 97.0, 0.0, 100.0]");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) 0);
        double double15 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double[] doubleArray13 = new double[] { 10.0f };
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(10.0d);
        double[] doubleArray9 = new double[] { 97.0d, '#', (byte) 10 };
        double[] doubleArray14 = new double[] { 10L, 0.0f, (-1L), (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, -1.0, -1.0]");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 100);
        double[] doubleArray22 = new double[] { 10.0f, 1, 0L, (-1.0f), (-1.0d), (-1L) };
        double[] doubleArray25 = new double[] { 10.0f, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 1.0, 0.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 35.0]");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10);
        double[] doubleArray16 = new double[] { (byte) -1, (-1), 10L, 'a', (byte) -1, '#' };
        double[] doubleArray18 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 10.0, 97.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double[] doubleArray5 = new double[] { ' ' };
        double[] doubleArray8 = new double[] { 'a', 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray5, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 0.0]");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray7 = new double[] { (byte) 1 };
        double[] doubleArray13 = new double[] { (byte) 1, (-1.0f), 10L, 32.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bCoeffs must be of size 1, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, -1.0, 10.0, 32.0, 0.0]");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray19 = new double[] { 10.0d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0]");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray14 = new double[] { (short) 0, '#' };
        double[] doubleArray19 = new double[] { 0.0d, (short) 0, ' ', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 32.0, 10.0]");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray18 = new double[] { (byte) -1, '#', 0, 0L };
        double[] doubleArray21 = new double[] { 100.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 35.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0]");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(100.0d);
        double[] doubleArray16 = new double[] { 0.0f, 1L, '#', (byte) 100, (-1.0f), (byte) 0 };
        double[] doubleArray23 = new double[] { 35.0d, (-1.0f), ' ', 35.0d, (short) 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0, 35.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, -1.0, 32.0, 35.0, 0.0, 100.0]");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray16 = new double[] { 52.0d, 0L };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        double double21 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process(32.0d);
        double[] doubleArray11 = new double[] { (short) -1, 97.0d, 1L, (short) -1, '#' };
        double[] doubleArray13 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 97.0, 1.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray21 = new double[] { '#', 10.0f, 32.0d };
        double[] doubleArray27 = new double[] { 0, (short) 1, 32.0d, ' ', 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray27);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0, 32.0, 32.0, 97.0]");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 'a');
        double[] doubleArray15 = new double[] { 1L, 10.0f, 10.0d, (short) 1, 10.0d };
        double[] doubleArray17 = new double[] { 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0]");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { 10.0d };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double[] doubleArray12 = new double[] { 1, 10.0d, '4', (byte) 10, 35.0d, (-1) };
        double[] doubleArray19 = new double[] { '#', 0.0f, 1.0d, (short) 0, (short) 10, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 52.0, 10.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 0.0, 1.0, 0.0, 10.0, -1.0]");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double[] doubleArray12 = new double[] { 1, 100.0d, 'a', (byte) 1 };
        double[] doubleArray18 = new double[] { 1L, (byte) -1, (short) -1, 100, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, -1.0, -1.0, 100.0, 0.0]");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray14 = new double[] { 100.0f, (byte) -1, 10L, (short) 0, (-1), '4' };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 10.0, 0.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double[] doubleArray8 = new double[] { (byte) 100, (-1.0d) };
        double[] doubleArray13 = new double[] { 1.0f, (byte) 100, (short) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, -1.0]");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray22 = new double[] { 100.0d, '4', (short) 1, (short) 10, 10.0f, 35.0d };
        double[] doubleArray24 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray24);
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 52.0, 1.0, 10.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0]");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray18 = new double[] { 10.0d, 1.0f };
        double[] doubleArray22 = new double[] { 10L, (byte) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 0.0, -1.0]");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray16 = new double[] { (byte) 1, 'a' };
        double[] doubleArray21 = new double[] { 1.0d, (short) 1, '#', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 35.0, 0.0]");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray10 = new double[] { 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 32.0]");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double[] doubleArray2 = new double[] {};
        double[] doubleArray5 = new double[] { 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray2, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, -1.0]");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) ' ');
        double[] doubleArray10 = new double[] { (byte) 0, 100L };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double[] doubleArray12 = new double[] { (short) -1, 0L, 97.0d, (short) 100 };
        double[] doubleArray17 = new double[] { 100.0f, 0.0d, 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 0.0, 10.0, 0.0]");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double[] doubleArray9 = new double[] { 35.0d };
        double[] doubleArray13 = new double[] { 35.0d, 10.0d, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 10.0, 35.0]");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((-1.0d));
        double[] doubleArray17 = new double[] { 100L, (short) 0, (byte) -1, (short) 1, 1.0d };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 0.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) (short) 10);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process(35.0d);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        double double21 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double[] doubleArray5 = new double[] { 'a', 10.0f, 0L };
        double[] doubleArray6 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process(52.0d);
        double[] doubleArray9 = new double[] { '#' };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(100.0d);
        double[] doubleArray18 = new double[] { 0, 10L, 10, 0.0f };
        double[] doubleArray23 = new double[] { '4', 0L, '#', 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, 0.0, 35.0, 100.0]");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double[] doubleArray8 = null;
        double[] doubleArray14 = new double[] { 100, 100, 1, (byte) 1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 1.0, 1.0, 0.0]");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        double[] doubleArray22 = new double[] { 'a', 1.0d };
        double[] doubleArray28 = new double[] { (short) 100, 10.0d, (-1L), (-1.0f), 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 10.0, -1.0, -1.0, 97.0]");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray6 = new double[] { 100.0d, (short) 1 };
        double[] doubleArray13 = new double[] { 52.0d, (short) 100, 0.0d, 'a', 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 100.0, 0.0, 97.0, 10.0, 32.0]");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { (byte) 100, 10.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 10.0, 1.0]");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double[] doubleArray13 = new double[] { 'a', 0, 10.0d };
        double[] doubleArray15 = new double[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray13 = new double[] { 10.0f, 'a', (-1.0f), 35.0d, (-1) };
        double[] doubleArray17 = new double[] { (-1.0d), (short) 0, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 97.0, -1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 100.0]");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double[] doubleArray10 = new double[] { 10L, 100.0d };
        double[] doubleArray14 = new double[] { (short) -1, (short) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, 32.0]");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process(35.0d);
        double[] doubleArray8 = null;
        double[] doubleArray10 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0]");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        double[] doubleArray27 = new double[] { (-1.0d), (byte) 1, '#', ' ', (short) 1 };
        double[] doubleArray33 = new double[] { 1.0d, 1, 100L, 100L, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray33);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0, 35.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 1.0, 100.0, 100.0, 10.0]");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) 'a');
        double[] doubleArray22 = new double[] { 'a', (byte) 10, (short) 1, (-1), 1L, 0L };
        double[] doubleArray27 = new double[] { (short) -1, 100.0d, (short) 100, (byte) 1 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 10.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 100.0, 100.0, 1.0]");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray14 = new double[] { (short) 1, 97.0d, (byte) 0, (short) 10 };
        double[] doubleArray18 = new double[] { 1L, (-1), 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, -1.0, 1.0]");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        double double23 = iIRFilter1.process((double) '4');
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }
}

